/**
 * Abstrakte Klasse Ui - beschreiben Sie hier die Klasse
 * 
 * @author (Stephan Wahlen)
 * @version (eine Version-Nummer oder ein Datum)
 */

import java.awt.*; 
import java.awt.event.*;
public abstract class Ui extends Canvas implements MouseListener
{
    private int x;
    private int y;
    public Ui()
    {
        addMouseListener(this);
    }
    
    public int render(int y, int x, Frame f)
    {
       return 1; 
    }
    
    public void mouseClicked(MouseEvent e) {
    }  
    public void mouseEntered(MouseEvent e) {  
        //System.out.println("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        //System.out.println("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        //System.out.println("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        //System.out.println("Mouse Released");  
    } 
}
