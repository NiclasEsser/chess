;/**
 * Beschreiben Sie hier die Klasse board.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class board extends Ui
{
    private static final boolean black = false;
    private static final boolean white = true;
    private static int fieldAmountX = 8;
    private static int fieldAmountY = 8;
    private int FieldLengthX; 
    private int FieldLengthY;
    boardField[][] playingBoard;
    
    private boardField startField;
    /**
     * Konstruktor für Objekte der Klasse board
     */
    public board(int FieldLengthX, int FieldLengthY)
    {
        boolean color;
        this.FieldLengthX = FieldLengthX;
        this.FieldLengthY = FieldLengthY;
        this.startField = startField;
        this.playingBoard = new boardField[this.fieldAmountX][this.fieldAmountY];
        for(int i = 0; i < this.fieldAmountX; i++){
            for(int j = 0; j < this.fieldAmountY; j++){
                    this.playingBoard[i][j] = new boardField(white, new boardCoordinate(i,j), FieldLengthX, FieldLengthY);
                
                if( (i+j)%2 != 0    ){
                    this.playingBoard[i][j] = new boardField(black, new boardCoordinate(i,j), FieldLengthX, FieldLengthY);
                }
            }
        }
        //addMouseListener(this);
    }
        
    public void reset(){
        //Set Pawns on field
        for(int y = 0; y < 8; y++){
             this.playingBoard[y][1].setFigure( new pawn(black)    );
             this.playingBoard[y][6].setFigure( new pawn(white)    );
        }
        
        //Set Rooks on field
        this.playingBoard[0][0].setFigure( new rook(black)    );
        this.playingBoard[7][0].setFigure( new rook(black)    );
        this.playingBoard[0][7].setFigure( new rook(white)    );
        this.playingBoard[7][7].setFigure( new rook(white)    );
        
        //Set knights on field
        this.playingBoard[1][0].setFigure( new knight(black)    );
        this.playingBoard[6][0].setFigure( new knight(black)    );
        this.playingBoard[1][7].setFigure( new knight(white)    );
        this.playingBoard[6][7].setFigure( new knight(white)    );
        
        //Set bishops on field
        this.playingBoard[2][0].setFigure( new bishop(black)    );
        this.playingBoard[5][0].setFigure( new bishop(black)    );
        this.playingBoard[2][7].setFigure( new bishop(white)    );
        this.playingBoard[5][7].setFigure( new bishop(white)    );
        
        //Set kings on field
        this.playingBoard[4][0].setFigure( new king(black)    );
        this.playingBoard[4][7].setFigure( new king(white)    );
        
        //Set queens on field
        this.playingBoard[3][0].setFigure( new queen(black)    );
        this.playingBoard[3][7].setFigure( new queen(white)    );
    }
        
    public int render(int x, int y, Frame f){
         for(int i = 0; i < this.fieldAmountX; i++){
            for(int j = 0; j < this.fieldAmountY; j++){
                
                //Calculate Offsets for each boardfield
                int fieldPosX = this.playingBoard[i][j].getSize().width*(i+1)+x;
                int fieldPosY = this.playingBoard[i][j].getSize().height*(j+1)+y;
                //Offset each boardFields position
                this.playingBoard[i][j].setLocation(fieldPosX, fieldPosY);
                
                this.playingBoard[i][j].render();
                this.playingBoard[i][j].addMouseListener(this);
                
                f.add(this.playingBoard[i][j]);
                
            }
         }
         return 1;
    }
    
    public int[] getBoardSize(){
        int[] xy = {this.fieldAmountX,this.fieldAmountY}; 
        return xy;
    }
    
    /*public int[] name2pos(String name){
        int x = name.charAt(0)-'A';
        int y = name.charAt(1)-'0'-1;
        int[] xy = {x,y};
        System.out.println("X: "+x+"Y: "+y);
        return xy;
    }*/    
    
    public void moveFigure(boardField startField, boardField endField){
        figure figure = startField.getFigure();
        boolean[][] allowedArray = figure.movement(this);
        int x = endField.getCoordinate().x;
        int y = endField.getCoordinate().y;
        if(allowedArray[x][y] == true){
            startField.removeFigure();
            endField.removeFigure();
            endField.setFigure(figure);
        }
    }
    public boardField getActiveBoardField(){
        boardField activeField = new boardField(white, new boardCoordinate(-1,-1), FieldLengthX, FieldLengthY);//this.playingBoard[0][0];
        for(int i = 0; i < this.fieldAmountX; i++){
           for(int j = 0; j < this.fieldAmountY; j++){
               if(this.playingBoard[i][j].getActive()){
                   activeField = this.playingBoard[i][j];
               }
            }
            
        }
        return activeField;
    }
               
    @Override
    public void mousePressed(MouseEvent e) {
       this.startField = getActiveBoardField();
       for(int i = 0; i < this.fieldAmountX; i++){
           for(int j = 0; j < this.fieldAmountY; j++){
                   this.playingBoard[i][j].setActive(false);
                   this.playingBoard[i][j].setBackground(new Color(1f,1f,1f,.1f ));
            }
        }
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
       boolean[][] allowedArray = new boolean[this.fieldAmountX][this.fieldAmountY];
       boardField endField = getActiveBoardField();
       moveFigure(startField, endField);
       figure figure = getActiveBoardField().getFigure();
       allowedArray = figure.movement(this);
       
       for(int i = 0; i < this.fieldAmountX; i++){
           for(int j = 0; j < this.fieldAmountY; j++){
               if(allowedArray[i][j]){
                   this.playingBoard[i][j].setAllowed(true);
               }else{
                    this.playingBoard[i][j].setAllowed(false);
               }
               this.playingBoard[i][j].setBackground(new Color(0f,0f,0f));
           }
       }
       
    }
   
}
