import java.util.*;

public class problem2{
    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        double time = 0.0;
        double distance = 0.0;

        System.out.println("Please enter the time the ball traveled in seconds : ");
        time = Kb.nextDouble();

        distance = (9.8) * ((time*time)/2);

        System.out.println(distance);




    }
    
}
