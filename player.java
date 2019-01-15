public class player
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private String name;
    private boolean color;
    private int zuege = 0;

    public player(boolean color, String name)
    {
        this.color = color;
        this.name = name;
    }
    
    public boolean getColor(){
        return this.color;
    }
    
    public String getName(){
        return this.name;
    }
    
}
