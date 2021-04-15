package hw06;
import java.util.*;
import java.util.Arrays;

public class Problem1 {

public static void main(String arg[]){

    Scanner Kb = new Scanner(System.in);

    double[]x = new double[6];
    double[]y = new double[6];
    double area = 0.0;
    int j = 5;

    System.out.println("Please enter x1 ");
    x[0] = Kb.nextDouble();

    System.out.println("Please enter x2 ");
    x[1] = Kb.nextDouble();

    System.out.println("Please enter x3 ");
    x[2] = Kb.nextDouble();

    System.out.println("Please enter x4 ");
    x[3] = Kb.nextDouble();

    System.out.println("Please enter x5 ");
    x[4] = Kb.nextDouble();

    System.out.println("Please enter x6 ");
    x[5] = Kb.nextDouble();

    System.out.println("Please enter y1 ");
    y[0] = Kb.nextDouble();

    System.out.println("Please enter y2 ");
    y[1] = Kb.nextDouble();

    System.out.println("Please enter y3 ");
    y[2] = Kb.nextDouble();

    System.out.println("Please enter y4 ");
    y[3] = Kb.nextDouble();

    System.out.println("Please enter y5 ");
    y[4] = Kb.nextDouble();

    System.out.println("Please enter y6 ");
    y[5] = Kb.nextDouble();

    for (int i = 0; i< 6; i++){

        area +=(x[j] + x[i]) * (y[j] - y[i]);
    }  
    
    System.out.println("The area of the polygon is " + area);
}
    


    
}
