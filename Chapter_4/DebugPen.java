public class DebugPen
{
private String color;
private String point;
public DebugPen()
{
color = ("black");
point = ("fine");
}
public DebugPen(String color, String point)
{
color = color;
point = point;
}
public String getColor()
{
return color;
}
public String getPoint()
{
return point;
}
    public static void main(String[] args) {
       
        DebugPen pen = new DebugPen();
        
        System.out.println("Pen Color: " + pen.getColor());
        System.out.println("Pen Point: " + pen.getPoint());
    
}


}


