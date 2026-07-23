class Time {
    private int hour;
    private int minute;
    private int second;

    // Default constructor
    public Time() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    // Parameterized constructor
    public Time(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 ||
                minute < 0 || minute > 59 ||
                second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid time!");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Add hours
    public Time addHours(int h) {
        int newHour = (this.hour + h) % 24;
        return new Time(newHour, minute, second);
    }

    // Subtract hours
    public Time subtractHours(int h) {
        int newHour = (this.hour - h) % 24;
        if (newHour < 0) newHour += 24;
        return new Time(newHour, minute, second);
    }

    // Display
    public void display() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
public class Time_Class {
    public static void main(String[] args) {

        Time t1 = new Time(10, 30, 45);

        System.out.print("Original time: ");
        t1.display();

        Time t2 = t1.addHours(5);
        System.out.print("After adding 5 hours: ");
        t2.display();

        Time t3 = t1.subtractHours(12);
        System.out.print("After subtracting 12 hours: ");
        t3.display();
    }
}