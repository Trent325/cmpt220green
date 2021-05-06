
public class problem2 {

    public static double bin2dec(String binaryString){

        for(char c : binaryString.toCharArray()){
            if(c != '1' && c != '0'){
                throw new NumberFormatException("The String isn't binary");
            }
        }
            double decimal = Integer.parseInt(binaryString, 2);
            return decimal;

    }
}
