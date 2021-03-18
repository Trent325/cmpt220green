import java.util.*;

public class Problem1 {
    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Enter a numerator : ");
        int numerator = Kb.nextInt();

        System.out.println("Enter a demoninator : ");
        int demoninator = Kb.nextInt();

        int gcd = 1;

        for(int i = 1; i <= numerator && i <= demoninator; i++)
        {
            if(numerator%i==0 && demoninator%i==0)
                gcd = i;
        }

        if(numerator > demoninator){
            if (numerator % demoninator == 0){
                System.out.println("The fraction " + numerator + "/" + demoninator + " is an improper fraction and can be reduced to " + numerator/demoninator);
            }
            else{

                int mixn = numerator%demoninator;
                int wholeNumber = (numerator - mixn)/demoninator;
                
                for(int i = 1; i <= mixn && i <= demoninator; i++)
                {
                    if(mixn%i==0 && demoninator%i==0)
                        gcd = i;
                }

                System.out.println("The fraction " + numerator + "/" + demoninator + " is an improper fraction and its mizxed fraction is "+ wholeNumber + "  + " + (mixn/gcd) + " / " + (demoninator/gcd) );
            }
            
        }
        else{
            System.out.println("The fraction " + numerator/gcd + " / " + demoninator/gcd + " is a proper fraction"); 
        }









    }
    
}
