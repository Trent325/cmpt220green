import java.util.*;

public class Problem2 {

    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter the number of sides : ");
        double n = Kb.nextInt();

        System.out.println("Enter the radius of the bounding circle :");
        double r = Kb.nextInt();

        System.out.println("The coordinates of the points on the polygon are ");

        double x = 0;
        double y = 0;
        double ang = Math.toRadians(360/n);

        for(int i = 0; i<n; i++){

            x = (x + (r*Math.cos(ang*i)));
            y = (y - (r*Math.sin(ang*i)));

            System.out.println("("+(x)+","+y+")");

            x=0;
            y=0;


        }

    }
    
}
