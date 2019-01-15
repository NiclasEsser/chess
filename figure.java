public abstract class figure
{  
    boolean color = false;
    
    public boolean getColor(){
        return false;
    }
    public char getChar(){
        return ' ';
    }
    public boolean[][] movement(board feld){ 
        return initMoveArray(feld);
    }
    
    public boolean[][] initMoveArray(board feld){
        int x = feld.getBoardSize()[0];
        int y = feld.getBoardSize()[1];
        boolean[][] moveArray = new boolean[x][y];
        return moveArray;
    }
}
