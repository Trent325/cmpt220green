import java.util.*;

public class Problem1 {

    public static int menu(){
        
        Scanner Kb = new Scanner(System.in);

        System.out.println("Main menu");
        System.out.println("1: Addition ");
        System.out.println("2: subtraction ");
        System.out.println("3: Multiplication ");
        System.out.println("4: Division ");
        System.out.println("5: Exit ");
        System.out.println("Please enter a number 1-5");
        int choice = Kb.nextInt();

        return choice;

    }

    public static void addition(){

        Scanner Kb = new Scanner(System.in);

        int n1 = (int)(Math.random()*9)+1;
        int n2 = (int)(Math.random()*9)+1;
        int answer = n1 + n2;

        System.out.println("What is "+n1+" + "+n2);
        int userA = Kb.nextInt();

        if ( userA == answer){
            System.out.println( "Correct" );
        }
        else {
             System.out.println("Your answer is wrong. The correct answer is "+answer);
        }
    }

    public static void subtraction(){

        Scanner Kb = new Scanner(System.in);

        int n1 = (int)(Math.random()*9)+1;
        int n2 = (int)(Math.random()*9)+1;
        int answer = n1 - n2;

        System.out.println("What is "+n1+" - "+n2);
        int userA = Kb.nextInt();

        if ( userA == answer){
            System.out.println( "Correct" );
        }
        else {
            System.out.println("Your answer is wrong. The correct answer is "+answer);
       }
   }


    public static void Multiplication(){

        Scanner Kb = new Scanner(System.in);

        int n1 = (int)(Math.random()*9)+1;
        int n2 = (int)(Math.random()*9)+1;
        int answer = n1 * n2;

        System.out.println("What is "+n1+" * "+n2);
        int userA = Kb.nextInt();

        if ( userA == answer){
            System.out.println( "Correct" );
        }
        else {
            System.out.println("Your answer is wrong. The correct answer is "+answer);
       }
   }


    public static void Division(){

        Scanner Kb = new Scanner(System.in);

        int n1 = (int)(Math.random()*9)+4;
        int n2 = (int)(Math.random()*4)+1;
        int answer = n1 / n2;

        System.out.println("What is "+n1+" / "+n2);
        int userA = Kb.nextInt();

        if ( userA == answer){
            System.out.println( "Correct" );
        }
        else {
            System.out.println("Your answer is wrong. The correct answer is "+answer);
       }
   }

   public static void end(){

        System.out.println("thanks for taking the test");

   }


    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        boolean gamingloop = true;

        while(gamingloop){

            switch(menu()){
                case 1 : addition(); break; 
                case 2 : subtraction(); break; 
                case 3 : Multiplication(); break; 
                case 4 : Division(); break; 
                case 5 : end(); gamingloop = false; break; 

            }
        }

    }
}