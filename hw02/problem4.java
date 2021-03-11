import java.util.*;

public class problem4 {

    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Please enter 2 points (in double form) :");
        double point1 = Kb.nextDouble();
        double point2 = Kb.nextDouble();
        double point3 = Kb.nextDouble();
        double point4 = Kb.nextDouble();

        double slope = 0.0;

        slope = ((point4-point2)/(point3-point1));

        System.out.println("The Slope for the line between ("+point1 +"," + point2+ ") ("+point3+","+point4+") is "+ slope);

    }
    
    
}
