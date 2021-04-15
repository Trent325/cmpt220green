package hw06;
import java.util.*;

public class Problem2 {

    public static int[] count(String S){

        int[] occurances = new int[10];

        for(int i = 0; i< S.length(); i++){
            if(Character.isDigit(S.charAt(i))){
                occurances[S.charAt(i)-'0']++;
            }
        }
            

        return occurances;

    }
    public static void main(String[]arg){

        Scanner Kb = new Scanner(System.in);

        System.out.print("Please enter a string of numbers and digits"); 
        String S = Kb.nextLine();

        int[] occurances = count(S);

        System.out.println("The digit 0 occurs "+occurances[0]+ " times.");
        System.out.println("The digit 1 occurs "+occurances[1]+ " times.");
        System.out.println("The digit 2 occurs "+occurances[2]+ " times.");
        System.out.println("The digit 3 occurs "+occurances[3]+ " times.");
        System.out.println("The digit 4 occurs "+occurances[4]+ " times.");
        System.out.println("The digit 5 occurs "+occurances[5]+ " times.");
        System.out.println("The digit 6 occurs "+occurances[6]+ " times.");
        System.out.println("The digit 7 occurs "+occurances[7]+ " times.");
        System.out.println("The digit 8 occurs "+occurances[8]+ " times.");
        System.out.println("The digit 8 occurs "+occurances[9]+ " times.");

    }
    
}
