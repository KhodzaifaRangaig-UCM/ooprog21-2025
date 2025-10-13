public class Employee {
    private int employeeNumber;
    private double payRate;

    // Constants
    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_MULTIPLIER = 1.5;

    // Constructor
    public Employee(int employeeNumber, double payRate) {
        setEmployeeNumber(employeeNumber);
        setPayRate(payRate);
    }

    // Setters with validation
    public void setEmployeeNumber(int employeeNumber) {
        if (employeeNumber > 0 && employeeNumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = employeeNumber;
        } else {
            System.out.println("Invalid employee number. Setting to 0.");
            this.employeeNumber = 0;
        }
    }

    public void setPayRate(double payRate) {
        if (payRate > 0 && payRate <= MAX_RATE) {
            this.payRate = payRate;
        } else {
            System.out.println("Invalid pay rate. Setting to 0.0.");
            this.payRate = 0.0;
        }
    }

    // Getters
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    // Compute regular pay (up to 40 hours)
    public double computeRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    // Compute overtime pay (over 40 hours)
    public double computeOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * payRate * OVERTIME_MULTIPLIER;
    }
}
