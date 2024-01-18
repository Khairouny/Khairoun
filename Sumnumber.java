import java.util.Scanner;

/**
 * Write a description of class Sumnumber here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (QUESTION 3(IV))
 */
public class Sumnumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a positive number (enter a negative number to finish): ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum of positive numbers: " + sum);
    }
}
