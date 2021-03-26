import java.util.*;

public class Problem4 {
   
    public static int[] squareRoot(int number) {
        int number1 = number;
        List<Integer> roots = new ArrayList<>();
        int coefficient = 1;
        for (int i = 2; i < number1; i++) {
            if (number1 % (i * i) == 0) {
                roots.add(i);
                number1 /= i * i;
                for (int j = 2; j < number1; j++) {
                    if (number1 % (j * j) == 0) {
                        roots.add(j);
                        number1 /= j * j;
                    }
                }
            }
        }
        for (int root : roots) coefficient *= root;
        return new int[]{coefficient, number1};
    }
    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int n = Kb.nextInt();

    



        System.out.println(squareRoot(n)[0] + "√" + squareRoot(n)[1]);








    }




}