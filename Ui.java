/**
 * Abstrakte Klasse Ui - beschreiben Sie hier die Klasse
 * 
 * @author (Stephan Wahlen)
 * @version (eine Version-Nummer oder ein Datum)
 */

import java.awt.*; 

public abstract class Ui extends Canvas  
{
    public Ui(){
    }
    
    public int render(int y, int x, Frame f)
    {
       return 1; 
    }
}
