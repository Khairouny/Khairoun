
/**
 * Write a description of class testprogram here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (Suza2023)
 */
public class testprogram
{
    public static void main(String[] args) {
                Room defaultRoom = new Room();
        System.out.println("Default Room: " + defaultRoom);

        Room customRoom = new Room(15.0, 8.0, 2);
        System.out.println("Custom Room: " + customRoom);
    }
}
