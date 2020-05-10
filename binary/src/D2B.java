// This class converts decimal to binary
// Author: Sonas MacRae

public class D2B {

    public static String Converter(int decimal) {
        String output = "";
        int counter = 1;

        while (counter < decimal) {
            counter *= 2;
        }

        counter /= 2;

        while (counter != 0) {
            if (counter <= decimal) {
                decimal -= counter;
                output += "1";
            }
            else
                output += "0";

           counter /= 2;
        }

        return output;
    }

}
