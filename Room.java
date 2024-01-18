 
/**
 * Write a description of class Room here.
 *
 * @author (Bita/6/22/019/tz)
 * @version (Q1)
 */
public class Room
{
    private double width;
    private double length;
    private int floor;
    public Room() {
        this.width = 10.0;
        this.length = 12.5;
        this.floor = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
    public Room(double param1, double param2, int floor) {
        setLength(Math.max(param1, param2));
        setWidth(Math.min(param1, param2));
        setFloor(floor);
    }

    public String toString() {
        return length + " x " + width + ", floor " + floor;
    }
}




