public class queen extends figure
{    
    private boolean color = false;
    
    public queen(boolean color){
        this.color = color;
    }
    
    @Override
    public char getChar(){
        if(this.color){
            return '♛';
        }else{
            return '♕';
        }
    }
    
    @Override
    public boolean getColor(){
        return this.color;
    }
    
    @Override
    public boolean[][] movement(board feld){
        boolean [][] allowedFields = this.initMoveArray(feld);
        return allowedFields;
    }
}
