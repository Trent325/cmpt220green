//package hw07;
import java.util.*;

public class Problem3 {

    public static class Point{

        double x = 0;
        double y = 0;

        public Point(double x, double y){

            this.x = x;
            this.y = y;

        }

        public double getX(){
            return this.x;
        }
        public double getY(){
            return this.y;
        }
        public String toString(){

            return this.getX() + " " + this.getY();
        }
    }

    public static Point getCenterPoint(Point p1, Point p2, Point p3){

        double x = (p1.getX() + p2.getX() + p3.getX() ) / 3;
        double y = (p1.getY() + p2.getY() + p3.getY() ) / 3;

        Point center = new Point(x , y);

        return center;
    }

    public static double getTriangleArea(Point p1, Point p2, Point p3){

        double test = (p1.getX() * (p2.getY() - p3.getY())) + (p2.getX() * ( p3.getY() - p1.getY())) + (p3.getX() * (p1.getY() - p2.getY()));

        if(test == 0){
            return -1.0;

        }
        else{

            double area = 0.5 * ((p1.getX() *(p2.getY() - p3.getY())) + (p2.getX() * (p3.getY() - p1.getY())) + (p3.getX() * (p1.getY() - p2.getY())) );
            return area;
        }



    }

    public static void main (String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter x1 , y1, x2 , y2 , x3 , y3");

        double x1 = Kb.nextDouble();
        double y1 = Kb.nextDouble();
        double x2 = Kb.nextDouble();
        double y2 = Kb.nextDouble();
        double x3 = Kb.nextDouble();
        double y3 = Kb.nextDouble();
        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);

        double area = getTriangleArea(p1, p2, p3);

        if(area == -1.0){

            System.out.println("The points entered are not a triangle");
        }
        else{

            System.out.println("The area is "+ area);
        }


    }

    
}
