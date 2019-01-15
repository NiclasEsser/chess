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
        int x = this.getCoordinate().x;
        int y = this.getCoordinate().y;
        /*
         * ---- rules where movement is allowed
         */
        for(int xoff = 2; xoff<=3; xoff++){
            for(int yoff = 2; yoff<=3; yoff++){
                //Generate paris of [2][3] ....to [-2][-3]
                if(xoff!=yoff){
					//Check outer boundaries
                    if(	(x+xoff)<feld.getBoardSize()[0] && (x+xoff)<feld.getBoardSize()[0]){
						allowedFields[x+xoff][y+yoff] = true;
					}
					
					//Check outer boundaries
					if(	(x-xoff)>0 && (x-xoff)>=0){
						allowedFields[x-xoff][y-yoff] = true;
					}
                }
            }
        }
        
        return allowedFields;
    }
}
