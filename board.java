
/**
 * Beschreiben Sie hier die Klasse board.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class board
{
    
    private static final boolean black = false;
    private static final boolean white = true;
    boardField[][] playingBoard = new boardField[8][8];

    /**
     * Konstruktor für Objekte der Klasse board
     */
    public board()
    {
        boolean color;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                this.playingBoard[i][j] = new boardField(white, "A"+(j+1));  
                
                if( (i+j)%2 != 0    ){
                    this.playingBoard[i][j] = new boardField(black, "A"+(j+1));  
                }
            }
        }
        
        this.render();
    }

    
    public void render(){
        char bg = '□';
        
         for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                //System.out.println(i +""+ j);
                if(this.playingBoard[i][j].getColor() == black){
                    bg = '⬛';
                }else{
                    bg = '⬜';
                }
                System.out.print(bg+" ");
            }
            System.out.print("\n");
         }
    }
}
