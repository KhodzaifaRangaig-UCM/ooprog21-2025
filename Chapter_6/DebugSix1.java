
import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01; // start with 1 cent
        int day = 1;

        System.out.print("Enter number of days >> ");
        days = keyboard.nextInt();

      
        while(day <= days) {
            System.out.println("Day " + day + ": " + money);
            money = money * 2; // money doubles each day
            day++;
        }

        
        System.out.println("After " + days + " days, you have $" + (money / 2));
        
        keyboard.close();
    }
}
