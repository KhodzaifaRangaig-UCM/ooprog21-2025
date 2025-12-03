import java.util.Scanner;

public class ForeignExchange {
 
    static String[] currencies = {"USD", "EUR", "JPY", "GBP", "AUD"};
    
    static double[][] rates = {
            {1.00, 2.00, 3.00, 4.00, 5.00},        
            {1.10, 2.30, 3.40, 4.50, 5.80},        
            {18.20, 19.50, 20.85, 22.75, 25.10},   
            {0.85, 0.90, 1.00, 1.20, 1.50},        
            {18.40, 40.40, 45.60, 48.00, 44.50}    
      };


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);      
        int choice = selectCurrency(sc);     
        printRates(choice);
        printSummary(choice);
        printDailyChanges(choice);
    }
     public static int selectCurrency(Scanner sc) {
        System.out.println("Choose a currency:");

        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }

        System.out.print("\nEnter choice: ");
        return sc.nextInt() - 1;
    }
       public static void printRates(int c) {
        System.out.println("\n==============================================");
        System.out.println("Currency: " + currencies[c]);

        for (int i = 0; i < 5; i++) {
            System.out.println("Rate on Nov " + (i + 1) + ": " + rates[c][i]);
        }
    }
       public static double getHighest(int c) {
        double peak = rates[c][0];
        for (double r : rates[c]) {
            if (r > peak) peak = r;
        }
        return peak;
    }
    public static double getLowest(int c) {
        double low = rates[c][0];
        for (double r : rates[c]) {
            if (r < low) low = r;
        }
        return low;
    }

    public static void printSummary(int c) {
        double peak = getHighest(c);
        double low = getLowest(c);
        System.out.println("\n=============== FOREX SUMMARY (Nov 1 – 5) ================");
        System.out.printf("%-10s %-6s %-6s %-6s %-6s %-6s %-6s %-6s\n",
                "Currency", "Nov1", "Nov2", "Nov3", "Nov4", "Nov5", "Peak", "Lowest");
        System.out.printf("%-10s ", currencies[c]);
        for (double r : rates[c]) System.out.printf("%-6.2f ", r);
        System.out.printf("%-6.2f %-6.2f\n", peak, low);
    }

      public static void printDailyChanges(int c) {
        System.out.println("\n=== DAILY CHANGES (Comparison from Previous Day) ===");
        System.out.println("(* + increase / - decrease / no change)");
        for (int i = 1; i < 5; i++) {
           double diff = rates[c][i] - rates[c][i - 1];
            if (diff > 0) {
                System.out.printf("Nov %d → Nov %d: +%.2f\n", i, i + 1, diff);
            }
            else if (diff < 0) {
                System.out.printf("Nov %d → Nov %d: -%.2f\n", i, i + 1, Math.abs(diff));
            }
            else {
                System.out.printf("Nov %d → Nov %d: No Change\n", i, i + 1);
            }
        }

        System.out.println("=========================================================");
    }

}
