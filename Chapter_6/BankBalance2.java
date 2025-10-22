import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your initial balance: $");
        double balance = input.nextDouble();

        double interestRate = 0.03;
        int year = 1;
        int choice;

        do {
         
            balance = balance + (balance * interestRate);

            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n",
                              year, interestRate, balance);

            System.out.print("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes\n  or any other number for no >> ");
            choice = input.nextInt();

            year++;
        } while (choice == 1);

        System.out.println("\n---- Operation complete. ----");
        input.close();
    }
}
