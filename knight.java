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
       
        //Generate paris of [2][3] ....to [-2][-3]
        for(int direction = -1; direction <=1; direction+=2){
            for(int xoff = 2; xoff<=3; xoff++){
                for(int yoff = 2; yoff<=3; yoff++){
                    //Only allow 
                    if(xoff!=yoff){
                        int xnew = x+(xoff*direction);
                        int ynew = y+(yoff*direction);
                        
                        //Check outer boundaries
                        int xmax = feld.getBoardSize()[0];
                        int ymax = feld.getBoardSize()[1];                        
                        
                        if(xnew <= xmax && ynew <= ymax && xnew>=0 && ynew>=0){
                            //Allow movement if field is empty or enemy figure
                            boardField desiredField = feld.playingBoard[xnew][ynew];
                            if( (   !desiredField.isOccupied() ) || (     desiredField.isOccupied() &&  desiredField.getFigure().color != this.color)   ){
                                allowedFields[xnew][ynew] = true;
                            }
                        }
                    }
                }
        }
    }
    
    return allowedFields;
}
}
