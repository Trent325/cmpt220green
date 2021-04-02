import java.util.*;

public class Problem1 {

    public static String decimalToBinary(int value){

        String binary = Integer.toBinaryString(value);

        return binary;

    }
    
    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int input = Kb.nextInt();

        String answer = decimalToBinary(input);

        System.out.println("The binary value is "+ answer);


    }
}
