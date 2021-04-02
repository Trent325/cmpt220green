import java.util.*;

public class Problem2 {

    public static String title(String s){

        String End = "";

        Scanner line = new Scanner(s);

        while(line.hasNext()){
            String temp = line.next();
            End += Character.toUpperCase(temp.charAt(0)) + temp.substring(1) + " ";
        }

        return End.trim();
   
    }

    public static void main(String arg[]){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Please enter a String: ");
        String input = Kb.nextLine();
        
        String ending = title(input);

        System.out.println("The new String is : "  + ending );
    }
    
}
