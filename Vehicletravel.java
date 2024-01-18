import java.util.Scanner;

/**
 * Write a description of class Vehicletravel here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (QUESTION 3(II))
 */
public class Vehicletravel
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the speed of the vehicle in mph? ");
        int speed = scanner.nextInt();
        System.out.print("How many hours has it traveled? ");
        int hours = scanner.nextInt();
        System.out.println("\nDistance Traveled Hour");
        for (int hour = 1; hour <= hours; hour++) {
            int distance = speed * hour;
            System.out.println(hour + ".       " + distance);
        }
    }
}
