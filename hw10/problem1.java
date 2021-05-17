import java.util.*;
import java.util.Calendar;

public class problem1 {

    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);
        int h, m, s;
        long t;

        System.out.print("Enter time1 (hour minute second): ");

        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();

        Time T1 = new Time(h, m, s);

        System.out.println(T1);
        System.out.println("Elapsed seconds in time1: " + T1.getSeconds());

        System.out.print("Enter time2 (elapsed time): ");
        t = in.nextLong();
        Time T2 = new Time(t);
        System.out.println(T1);

        System.out.println("Elapsed seconds in time1: " + T1.getSeconds());

        System.out.println("time1.compareTo(time2)? " + T1.compareTo(T2));
        Time T3 = T1.clone();
        System.out.println("time3 is created as a clone of time1 time1.compareTo(time3)? " + T1.compareTo(T3));
    }
}

class Time implements Cloneable, Comparable<Time> {

    private long t;

    public Time() {
        t = System.currentTimeMillis() / 1000;
    }

    public Time(long t) {
        this.t = t;
    }

    public Time(int h, int m, int s) {
        t = (((h * 60) + m) * 60) + s;
    }

    public int getHour() {
        return (int) (t / 3600) % 24;
    }

    public int getMinute() {
        return (int) (t / 60) % 60;
    }

    public int getSecond() {
        return (int) t % 60;
    }

    public long getSeconds() {
        return t;
    }

    public String toString() {
        return String.format("%d hours %d minutes %d seconds", getHour(), getMinute(), getSecond());
    }

    @Override
    public int compareTo(Time arg0) {
        return (int) (t - ((Time) arg0).t);
    }

    public Time clone() {
        Time T2 = new Time();
        T2.t = t;
        return T2;
    }

    public boolean equals(Time T) {
        return T.t == t;
    }

}
