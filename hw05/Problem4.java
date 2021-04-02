import java.util.*;

public class Problem4 {
    public static void main(String[] args){

        Scanner Kb = new Scanner(System.in);

       System.out.println("Please enter a number or rows");
       int rows = Kb.nextInt();

       for (int i = 0; i < rows; i++) {

            int number = 1;

            System.out.printf("%" + (rows - i) * 2 + "s", "");

            for (int j = 0; j <= i; j++) {

                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
       }
    }
}



            

        

        

       
       
    

