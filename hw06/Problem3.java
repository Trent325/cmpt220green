package hw06;
import java.util.*;
import java.util.Arrays;

public class Problem3 {

    public static boolean isAnagram(String s1, String s2){

        String st1 = s1.replaceAll("\\s", "");
        String st2 = s2.replaceAll("\\s", "");

        boolean Anagram = true;

        if(st1.length() != st2.length()){
            Anagram = false;
        }

        else{
            char[] S1 = st1.toLowerCase().toCharArray();
            char[] S2 = st2.toLowerCase().toCharArray();

            Arrays.sort(S1);
            Arrays.sort(S2);

            Anagram = Arrays.equals(S1, S2);
        }

        return Anagram;
    }

    public static void main(String[] Arg){

        Scanner Kb = new Scanner(System.in);

        System.out.println("Please enter a String: ");
        String s1 = Kb.nextLine();

        System.out.println("Please enter a String : ");
        String s2 = Kb.nextLine();

        boolean isTrue = isAnagram(s1, s2);

        if(isTrue){
            System.out.println(s1 + " and "+s2+" are anagrams");
        }

        else{
            System.out.println(s1 + " and "+s2+" are  not anagrams");
        }




    }
    
}
