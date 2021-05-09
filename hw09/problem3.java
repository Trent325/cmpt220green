// JA: You should have a main method to call this.

public class problem3 {

    public static class BinaryFormatException extends NumberFormatException {
        public BinaryFormatException() {
        }

        public BinaryFormatException(String s) {
            super(s);
        }
    }

    public static double bin2dec(String binaryString){

        try{
            double decimal = Integer.parseInt(binaryString, 2);
            return decimal;

        }
        catch(Exception binaryFormatException){
            throw new BinaryFormatException("the string isnt binary");
        }

    }
}


