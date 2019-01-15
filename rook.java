public class rook extends figure
{    
    private boolean color = false;
    
    public rook(boolean color){
        this.color = color;
    }
    
    @Override
    public char getChar(){
        if(this.color){
            return '♜';
        }else{
            return '♖';
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
        int xcur;
        int ycur;
        for(int i = -1; i <= 1; i=i+2){
            ycur = y;
            xcur = x;
            while(!(feld.playingBoard[xcur][y].isOccupied()) && xcur >= 0 && xcur <= 7)
            {
                xcur = xcur + i;
                allowedFields[xcur][y] = true;           
            }
            while(!(feld.playingBoard[x][ycur].isOccupied()) && ycur >= 0 && ycur <= 7)
            {
                ycur = ycur + i;
                allowedFields[x][ycur] = true;           
            }
            if(feld.playingBoard[x][ycur].getColor() != this.color)
            {
                allowedFields[x][ycur] = true;
            }
            if(feld.playingBoard[xcur][y].getColor() != this.color)
            {
                allowedFields[xcur][y] = true;
            }
        }
        
        return allowedFields;
    }
}
