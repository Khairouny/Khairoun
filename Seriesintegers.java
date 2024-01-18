import java.util.Scanner;

/**
 * Write a description of class Seriesintegers here.
 *
 * @author (Bita/6/22/019/tze)
 * @version (QUESTION 3 (VI))
 */
public class Seriesintegers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Enter an integer (enter 99 to finish): ");
            int number = scanner.nextInt();
            if (number == 99) {
                break;
            }
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}
