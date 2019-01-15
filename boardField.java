
/**
 * Beschreiben Sie hier die Klasse boardField.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import java.awt.*;
public class boardField extends Ui
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private figure      occupation;
    private boolean     fieldColor;
    private String      name;
    private int         FieldLengthX;
    private int         FieldLengthY;

    /**
     * Konstruktor für Objekte der Klasse boardField
     */
    public boardField(boolean color, String name, int FieldLengthX, int FieldLengthY)
    {
       this.fieldColor     = color;
       this.name           = name;
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
        return this.name;
    }
    
    public void setFigure(figure occupation){
        this.occupation = occupation;
    }
    
    public figure getFigure(){
        if(this.isOccupied()){
            return this.occupation;
        }else{
            return null;
        }
    }
    
    public void paint(Graphics g) {

        if(this.getColor()){
            setBackground (Color.GRAY);  
        }else{
            setBackground (Color.WHITE);  
        }
        
        // Retrieve the graphics context; this object is used to paint shapes
        Graphics2D g2d = (Graphics2D) g;
        // Set the desired font if different from default font
        Font font = new Font("Serif", Font.PLAIN, this.getSize().width);
        g2d.setFont(font);

        FontMetrics fontMetrics = g2d.getFontMetrics();

        this.setForeground (Color.BLACK); 
        // Draw a string such that the top-left corner is at x, y
        if(this.getFigure() != null)
        {
            g2d.drawString(this.getFigure().getChar()+"", 0, 0+fontMetrics.getAscent());
        }
    }
    
    public int render(){
        return 1;
    }
}
