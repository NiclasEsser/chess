public class knight implements figure
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
    public boolean movement(int[] feld){
        return false;
    }
}
