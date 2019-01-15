
/**
 * Write a description of class EventHandler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*; 
import java.awt.event.*;
public class EventHandler implements MouseListener
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private MouseEvent e;
    private Frame f;
    
    /**
     * Constructor for objects of class EventHandler
     */
    public EventHandler()
    {
        
        // initialise instance variables
        /*this.x = e.getX();
        this.y = e.getY();*/
    }
    
    public Frame render(int x, int y){
       Frame f = new Frame("Chess Game");
       f.setLayout(null);  
       f.setSize(x, y);  
       f.setVisible(true);
       
       return f;
    }
    
    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("X: "+this.x+" Y: "+this.y);
    }

    void saySomething(String eventDescription, MouseEvent e) {
    }
}
