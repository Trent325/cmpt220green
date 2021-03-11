import java.util.*;

public class Problem1{
 
        public static void main(String arg []){

        int width;
        int height;

        Scanner Kb = new Scanner(System.in);

        System.out.println("Please enter the width and height of a rectangle: ");
        width = Kb.nextInt();
        height = Kb.nextInt();
        
        System.out.println("The perimeter is " + ((2*width)+(2*height)));
        System.out.println("The Area is "+(width*height));
        System.out.println("The Diagonal is " + (Math.sqrt((width*width)+(height*height))));





    }
    
}
