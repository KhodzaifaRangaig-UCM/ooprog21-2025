import java.util.Scanner;

public class DebugFour1 {
   public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
   int radius;
        
 System.out.print("Enter a radius for a circle >> ");
 radius = input.nextInt();
 Circle c = new Circle(radius);
        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
    }
}
class Circle {
    private int radius;
     public Circle(int radius) {
        this.radius = radius;
    }
      public int getRad() {
        return radius;
    }public int getDiam() {
        return 2 * radius;
    }public double getArea() {
        return Math.PI * radius * radius;
    }
}
