import java.util.Scanner;

public class DebugFour2 {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 String color;
 String point;
 System.out.print("Enter a color ink for the pen >> ");
 color = input.nextLine();

 System.out.print("Enter a point size - fine, medium, or thick >> ");
 point = input.nextLine();
 DebugPen pen1 = new DebugPen();             
 DebugPen pen2 = new DebugPen(point, color); 
 System.out.println("Default value pen:");
  display(pen1);

 System.out.println("User value pen:");
  display(pen2);
    }
public static void display(DebugPen p) {
  System.out.println(" The pen has ink color " + p.getColor());
  System.out.println(" and a " + p.getPoint() + " point.");
    }
}
