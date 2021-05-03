import java.util.Arrays;
import java.util.ArrayList;

public class Problem1 {

    public static ArrayList<String> split(String s, String delimiters) {

        String[] split = new String[delimiters.length()];
        for (int i = 0; i < delimiters.length(); i++) {

            split[i] = delimiters.substring(i, i + 1);
        }

        ArrayList<String> answer = new ArrayList<String>();
        int count = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            for (int j = 0; j < split.length; j++) {

                if (s.substring(i, i + 1).equals(split[j])) {
                    answer.add(s.substring(count, i));
                    count = i + 1;

                }
            }
        }

        answer.add(s.substring(count));

        return answer;

    }

    public static void main(String arg[]) {

        String delimiters = "# ?";
        String s = "AB#C D?EF#45";

        ArrayList<String> answers = split(s, delimiters);

        System.out.println(answers);
    }

}
