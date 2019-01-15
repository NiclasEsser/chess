
/**
 * Write a description of class EventHandler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*; 
import java.awt.event.*;
public class EventHandler extends Frame implements MouseListener
{
    // instance variables - replace the example below with your own

    private Label f;
    
    /**
     * Constructor for objects of class EventHandler
     */
    public EventHandler(int x, int y, int pixel)
    {
        addMouseListener(this);
        f = new Label();
        f.setBounds(20,50,100,20);  
        add(f);  
        setLayout(null);  
        setSize(x*pixel, y*pixel);  
        setVisible(true);
        // initialise instance variables
        //this.x = e.getX();
        //this.y = e.getY();
    }
    /*
    public Frame render(int x, int y, int pixel){
       Frame f = new Frame("Chess Game");
       f.setLayout(null);  
       f.setSize(x*pixel, y*pixel);  
       f.setVisible(true);
       
       return f;
    }*/
    
    public void mouseClicked(MouseEvent e) {  
        f.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        f.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {  
        f.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        f.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        f.setText("Mouse Released");  
    } 
}
