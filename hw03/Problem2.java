import java.util.*;

public class Problem2 {
    
    
    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter the coordinates for two points in order followed by spaces: ");
        double x1 = Kb.nextDouble();
        double y1 = Kb.nextDouble();
        double x2 = Kb.nextDouble();
        double y2 = Kb.nextDouble();

        
        double slope, intercept;
	    slope = y2 - y1 / x2 - x1;
	    intercept = y1 - x1 * slope;

        System.out.println("the line equation for the points ("+x1+ ","+y1+") ("+x2+","+y2+") is y = "+slope+ "x + "+intercept );
        
        }

        

        


    }

