package hw07;
import java.util.*;


public class Problem1{

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

    public static Point getInterestingPoint(Point p1, Point p2, Point p3, Point p4){


        double a1 = p2.getY() - p1.getY();
        double a2 = p4.getY() - p3.getY();
        double b1 = p1.getX() - p2.getX();
        double b2 = p3.getX() - p4.getX();
        double c1 = a1*(p1.getX()) + b1*(p1.getY());
        double c2 = a2*(p3.getX()) + b2*(p3.getY());

        double determinate = (a1*b2) - (a2*b1); 

        if(determinate == 0){
            return null;
        }

        else{

            double x = ((b2*c1) - (b1*c2)) / determinate;
            double y = ((a1*c2) - (a2*c1)) / determinate;

            Point interesction = new Point(x,y);

            return interesction;

        }
    }

    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Please enter x1 , y1 , x2 , y2 , x3 , y3 , x4 , y4");

        double x1 = Kb.nextDouble();
        double y1 = Kb.nextDouble();
        double x2 = Kb.nextDouble();
        double y2 = Kb.nextDouble();
        double x3 = Kb.nextDouble();
        double y3 = Kb.nextDouble();
        double x4 = Kb.nextDouble();
        double y4 = Kb.nextDouble();

        Point p1 = new Point(x1,y1);
        Point p2 = new Point(x2,y2);
        Point p3 = new Point(x3,y3);
        Point p4 = new Point(x4,y4);

        if(getInterestingPoint(p1, p2, p3, p4) == null){

            System.out.println("The lines are parallel");
        }

        else{
            
            Point Intersection = getInterestingPoint(p1, p2, p3, p4);

            System.out.println("The intersection of the lines are " + Intersection.toString());
        }


        
    }

}