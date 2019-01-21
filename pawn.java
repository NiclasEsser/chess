public class pawn extends figure
{    
    private boolean color = false;
    
    public pawn(boolean color){
        this.color = color;
    }
    
    @Override
    public char getChar(){
        if(this.color){
            return '♟';
        }else{
            return '♙';
        }
    }
    
    @Override
    public boolean getColor(){
        return this.color;
    }
    
    @Override
    public boolean[][] movement(board feld){
        boolean [][] allowedFields = this.initMoveArray(feld);
        int x = this.getCoordinate().x;
        int y = this.getCoordinate().y;
        int yoff = 1;
        int startposition = 1;
        
        if(this.color){
            yoff = -1;
            startposition = 6;
        }
        // Feld frei, kann besetzt werden
        if(!(feld.playingBoard[x][y+yoff].isOccupied())){
            allowedFields[x][y+yoff] = true;
            if(startposition == y){
                if(!(feld.playingBoard[x][y+(2*yoff)].isOccupied())){
                    allowedFields[x][y+(2*yoff)] = true;
                }
            }
        }
        // Schlage Gegner diagonal
        for(int i = -1; i <= 1; i=i+2){
                if(feld.playingBoard[x+i][y+yoff].isOccupied() && feld.playingBoard[x+i][y+yoff].getColor() != this.color){
                    allowedFields[x+i][y+yoff] = true;
                }
        }
                
        return allowedFields;
    }
}
