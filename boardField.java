
/**
 * Beschreiben Sie hier die Klasse boardField.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class boardField extends Ui
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private figure              occupation;
    private boolean             fieldColor;
    private boardCoordinate     coordinate;
    private int                 FieldLengthX;
    private int                 FieldLengthY;
    
    
    private boolean             active;
    private boolean             allowed;
    
    /**
     * Konstruktor für Objekte der Klasse boardField
     */
    public boardField(boolean color, boardCoordinate coordinate, int FieldLengthX, int FieldLengthY)
    {
       this.fieldColor     = color;
       this.active         = active;
       this.allowed        = allowed;
       this.coordinate     = coordinate; 
       this.occupation     = occupation;
       this.FieldLengthX   = FieldLengthX;
       this.FieldLengthY   = FieldLengthY;
    
       this.setSize(this.FieldLengthX, this.FieldLengthY);
    }

    public boolean isOccupied()
    {
        return (this.occupation != null);
    }
    
    public boolean getColor(){
        return this.fieldColor;
    }
    
    public String getName(){
        return this.coordinate.name;
    }
    
    public boardCoordinate getCoordinate(){
        return this.coordinate;
    }
    
    public void setActive(boolean active){
        this.active = active;
    }
    
    public boolean getActive(){
        return this.active;
    }
    
    public void setAllowed(boolean allowed){
        this.allowed = allowed;
    }
    
    public boolean getAllowed(){
        return this.allowed;
    }
    
    public void setFigure(figure occupation){
        this.occupation = occupation;
        this.occupation.setCoordinate(this.coordinate);
    }
    
    public void removeFigure(){
        this.occupation = null;
    }
    
    public figure getFigure(){
        if(this.isOccupied()){
            return this.occupation;
        }else{
            return null;
        }
    }
   
    public void paint(Graphics g) {
        
        if(this.getColor() && !this.active && !this.allowed){
            this.setBackground (Color.GRAY);  
        }else if (!this.getColor() && !this.active && !this.allowed){
            this.setBackground (Color.WHITE);  
        }else if(this.active && !this.allowed){
            Color color = new Color(135, 206, 235);
            this.setBackground (color); 
        }else if(this.allowed && !this.active){
            Color color = new Color(152, 251, 152 );
            this.setBackground (color); 
        }
        // Retrieve the graphics context; this object is used to paint shapes
        Graphics2D g2d = (Graphics2D) g;
        
        // Set the desired font if different from default font
        Font font = new Font("Serif", Font.PLAIN, this.getSize().width);
        g2d.setFont(font);
        FontMetrics fontMetrics = g2d.getFontMetrics();
        setForeground(Color.BLACK); 
        // Draw a string such that the top-left corner is at x, y
        if(this.getFigure() != null)
        {
            g2d.drawString(this.getFigure().getChar()+"", 0, 0+fontMetrics.getAscent());
        }
    }
    
    public int render(){
        return 1;
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
       if (this.occupation != null || this.allowed) {
           this.active = true;
       }
       System.out.println("BX: "+this.getCoordinate().x+"BY: "+this.getCoordinate().y+"active: "+this.active+"allowed: "+this.allowed);
    }
}
