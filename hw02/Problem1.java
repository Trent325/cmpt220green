import java.util.*;

public class Problem1{
 
        public static void main(String arg []){

        double width;
        double height;

        Scanner Kb = new Scanner(System.in);

        System.out.println("Please enter the width and height of a rectangle: ");
        width = Kb.nextDouble();
        height = Kb.nextDouble();
        
        System.out.println("The perimeter is " + ((2*width)+(2*height)));
        System.out.println("The Area is "+(width*height));
        System.out.println("The Diagonal is " + (Math.sqrt((width*width)+(height*height))));





    }
    
}
