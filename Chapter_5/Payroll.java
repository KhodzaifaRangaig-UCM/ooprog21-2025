import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = input.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = input.nextDouble();

        // Validate pay rate
        if (payRate > 60.00) {
            System.out.println("Pay rate exceeds the maximum of 60.00. Setting to 60.00.");
            payRate = 60.00;
        }

        double regularPay;
        double overtimePay = 0.0;

        // Calculate regular and overtime pay
        if (hoursWorked <= 40) {
            regularPay = hoursWorked * payRate;
        } else {
            regularPay = 40 * payRate;
            overtimePay = (hoursWorked - 40) * payRate * 1.5;
        }

        // Display results
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

        input.close();
    }
}
