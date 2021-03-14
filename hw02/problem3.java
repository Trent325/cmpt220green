import java.util.Scanner;

public class problem3{

    public static void main(String[] arg){

        Scanner Kb = new Scanner(System.in);

        double force = 0.0;
        double mass = 0.0;
        double acceleration = 0.0;
        double coe = 0.0;

        System.out.println("Please enter the friction force in Newtons: ");
        force = Kb.nextDouble();

        System.out.println("Please enter the object's mass : ");
        mass = Kb.nextDouble();

        System.out.println("Please enter the acceleration of the object : ");
        acceleration = Kb.nextDouble();

//        coe = force / ((mass*9.8) + (mass*acceleration));
        coe = (force - mass*acceleration) / (mass*9.8);

        System.out.println("The coeffiecent of friction is "+ coe);


    }
    
}
