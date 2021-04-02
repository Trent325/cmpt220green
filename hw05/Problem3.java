import java.util.*;

public class Problem3 {

    public static String format(long seconds){

        String end = " ";
        int hours = 0;
        int minutes = 0;
        int seconds1 = 0;

        hours = (int)seconds/3600;
        minutes = (int)((seconds%3600) / 60);
        seconds1 = (int)seconds%60;

        end =  hours + ":" + minutes +":" + seconds1;

        return end;


    }

    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter total seconds:");
        long seconds = Kb.nextLong();

        String answer = format(seconds);

        System.out.println("The hours, minutes and seconds for the total seconds "+ seconds + " is "+answer);
    }
    
}
