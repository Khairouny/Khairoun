import java.util.Scanner;

/**
 * Write a description of class Averagerainfall here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (QUESTION 3(III))
 */
public class Averagerainfall
{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numYears = scanner.nextInt();
        double totalRainfall = 0;
        int totalMonths = numYears * 12;
        for (int year = 1; year <= numYears; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter inches of rainfall for Year " + year + ", Month " + month + ": ");
                double rainfall = scanner.nextDouble();
                totalRainfall += rainfall;
            }
        }scanner.close();
        double averageRainfall = totalRainfall / totalMonths;
        System.out.println("\nNumber of months: " + totalMonths);
        System.out.println("Total inches of rainfall: " + totalRainfall);
        System.out.println("Average rainfall per month: " + averageRainfall);
    }
}
