
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (Q3)
 */
public class Mapinduzi
{
    private String name;
    private int day;
    private String month;
    public Mapinduzi(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public static double avgDate(Mapinduzi[] holidays) {
        int totalDays = 0;
        for (Mapinduzi holiday : holidays) {
            totalDays += holiday.day;
        }
        return (double) totalDays / holidays.length;
    }

    public static void main(String[] args) {
       
        Mapinduzi independenceDay = new Mapinduzi("Independence Day", 12, "January");

        Mapinduzi[] holidaysArray = {
                new Mapinduzi("New Year", 1, "January"),
                new Mapinduzi("Christmas", 25, "December"),
                independenceDay
        };
        double averageDay = Mapinduzi.avgDate(holidaysArray);
        System.out.println("Average day of the month: " + averageDay);
    }
}


