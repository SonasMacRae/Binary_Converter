// This class converts binary to decimal
// Author: Sonas MacRae

public class B2D {

    public static int Converter(String decimal) {
        int output = 0;
        int counter = 1;

        for (int i = decimal.length() -1; i >= 0 ; i--) {
            if (decimal.charAt(i) == '1') {
                output += counter;
            }
            counter *= 2;
        }

        return output;
    }



}
