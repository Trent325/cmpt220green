import java.util.Arrays;
import java.util.*;

public class problem1{

    public static void main(String[] arg){

        int[] Array = new int[100];

        Scanner Kb = new Scanner(System.in);


        for(int i = 0; i<Array.length; i++){
            Array[i] = (int)(Math.random()*100-1);
        }

        System.out.println("There is an array with integers. Enter a number to return the integer at that spot in the Array");
        int guess = Kb.nextInt();

        try{
            System.out.println("The number at spot "+ guess + " is " + Array[guess]);
        }
        catch(Exception IndexOutOfBounds){
            System.out.println("Out of bounds");

        }

    }



}