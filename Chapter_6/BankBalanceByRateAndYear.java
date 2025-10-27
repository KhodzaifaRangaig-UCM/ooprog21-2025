import java.util.Scanner;

public class AccountBalanceCalculator {

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial bank balance > ");
        double initialBalance = scanner.nextDouble();
        
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        for (double interestRate : interestRates) {
            System.out.println("With an initial balance of $" + initialBalance + " at an interest rate of " + interestRate);
            
            double balance = initialBalance;
            for (int year = 1; year <= 4; year++) {
                balance += balance * interestRate;
                System.out.println("After year " + year + " balance is " + String.format("%.4f", balance));
            }
            System.out.println();  
        }
        
        scanner.close();
    }
}
