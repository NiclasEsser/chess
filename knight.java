public class knight extends figure
{    
    private boolean color = false;
    
    public knight(boolean color){
        this.color = color;
    }
    
    @Override
    public char getChar(){
        if(this.color){
            return '♞';
        }else{
            return '♘';
        }
    }
    
    @Override
    public boolean getColor(){
        return this.color;
    }
    
    @Override
    public boolean[][] movement(board feld){
        boolean [][] allowedFields = this.initMoveArray(feld);
        //cant move to current field 
        allowedFields[this.coordinate.x][this.coordinate.y] = false;
        return allowedFields;
    }
}
