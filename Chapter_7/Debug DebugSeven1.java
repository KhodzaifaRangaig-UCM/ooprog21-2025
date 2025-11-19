// Makes String comparisons
import java.util.*;

public class DebugSeven1
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      String name1, name2, name3;

      System.out.println("Enter three names.");
      System.out.println("They can be the same or different.");

      System.out.print("First name >> ");
      name1 = kb.nextLine();     // FIXED: added ()

      System.out.print("Second name >> ");
      name2 = kb.nextLine();     // FIXED: added ()

      System.out.print("Third name >> ");
      name3 = kb.nextLine();     // FIXED: added ()

      compareNames(name1, name2);
      compareNames(name1, name3);
      compareNames(name2, name3);
   }

   public static void compareNames(String n1, String n2)   // FIXED name + parameters
   {
      System.out.print(n1 + " and " + n2);
      if(n1.equals(n2))                                   // FIXED missing )
         System.out.println(" are the same");
      else
         System.out.println(" are different");
   }
}
