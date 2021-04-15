package hw06;
import java.util.*;

public class Problem4 {

    public static double[][] inverse(double[][] A){
        double temp = 0.0;
        double determinate = (A[0][0]*A[1][1]) - (A[0][1]*A[1][0]);

        if(determinate == 0){
            return null;
        }

        else{
            temp = A[0][0];
            A[0][0] = A[1][1];
            A[1][1] = temp;
            A[0][1] = -A[0][1];
            A[1][0] = -A[1][0];

            for(int i = 0; i < 2; ++i) {
                for(int j = 0; j < 2; ++j){
                         A[i][j] = (A[i][j]/determinate);
            }
        }
    
        return A;

        }

    }

    public static void main(String arg []){

        double[][] matrix = new double [2][2];

        Scanner Kb = new Scanner(System.in);
        
        System.out.println("Please enter A : ");
        matrix[0][0] = Kb.nextDouble();

        System.out.println("Please enter B : ");
        matrix[0][1] = Kb.nextDouble();

        System.out.println("Please enter C : ");
        matrix[1][0] = Kb.nextDouble();

        System.out.println("Please enter D : ");
        matrix[1][1] = Kb.nextDouble();

        double [][] result = inverse(matrix);

        if(result == null){
            System.out.println("No inverse matrix");
        }

        else{
            for(int i = 0; i < 2; ++i) {
                for(int j = 0; j < 2; ++j){
                         System.out.print(result[i][j] + " ");
            }
            System.out.print("\n");

        }
    }
}
}
    

