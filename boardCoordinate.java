public class boardCoordinate
{
    public int x;
    public int y;
    public String name;

    public boardCoordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
        this.name = pos2name(this.x, this.y);
    }

    public String pos2name(int x, int y){
        String name;
        char xlabel = (char)(  x+(int)'A'    );
        char ylabel = (char)(  y+(int)'1'    );
        
        name = xlabel+""+ylabel;
        return name;
    }
}
