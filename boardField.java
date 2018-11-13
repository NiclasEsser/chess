
/**
 * Beschreiben Sie hier die Klasse boardField.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class boardField
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private figure      occupation;
    private boolean     fieldColor;
    private String      name;

    /**
     * Konstruktor für Objekte der Klasse boardField
     */
    public boardField(boolean color, String name)
    {
       this.fieldColor  = color;
       this.name        = name;
       this.occupation  = occupation;
    }

    public boolean isOccupied()
    {
        return (this.occupation != null);
    }
    
    public boolean getColor(){
        return this.fieldColor;
    }
    
    public figure getFigure(){
        if(this.isOccupied()){
            return this.occupation;
        }else{
            return new figure();
        }
    }
}
