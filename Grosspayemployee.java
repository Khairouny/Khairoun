import java.util.Scanner;

/**
 * Write a description of class Grosspayemployee here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (QUESTION 2(III))
 */
public class Grosspayemployee
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter number of hours worked for the week: ");
        double hoursWorked = scanner.nextDouble();
        double regularPay = Math.min(40, hoursWorked) * hourlyRate;
        double overtimePay = Math.max(0, hoursWorked - 40) * 1.5 * hourlyRate;
        double grossPay = regularPay + overtimePay;
        double incomeTaxRate = 0.15;
        double parkingCharge = 20.0;
        double incomeTax = (grossPay > 500.0) ? grossPay * incomeTaxRate : 0.0;
        double deductions = incomeTax + parkingCharge;
        double netPay = grossPay - deductions;
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Overtime Pay: $" + overtimePay);
        System.out.println("Net Pay: $" + netPay);
        System.out.println("Deductions: $" + deductions);
    }
}
