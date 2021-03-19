import java.util.*;

public class problem4 {

    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        int x = (int)(Math.random()*10)+5;
        int y = (int)(Math.random()*5)+1;
        int S = (int)(Math.random()*3)+1;

        int a = x - y;

        System.out.println("What is "+ x + " - " + y + " ? :");
        int answer = Kb.nextInt();

        if( answer == a){
            if(S == 1){
                System.out.println("excellent");
            }
            if(S == 2){
                System.out.println("correct");
            }
            if(S == 3){
                System.out.println("way to go");
            }  

        }
        else{
            if(S == 1){
                System.out.println("incorrect");
            }
            if(S == 2){
                System.out.println("wrong");
            }
            if(S == 3){
                System.out.println("not right");
            }  

        }



    }
    
}
