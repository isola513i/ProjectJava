package int101;

import work01.Tool;

import static work01.Tool.*;

public class Int101w10 {
    public static void main(String[] args) {
        System.out.println("Median: " + median(3.0, 6.0, 4.0));
        System.out.println("Compute: " + compute(4.0, 5.0, "add"));
        System.out.println("DigitProduct: " + digitProduct(755));
    }

    static void work01Tool() {
        /*
        1.1 create a utility class (a public final class with
        -   a private constructor) named "Tool" in a package named "work01".
        1.2 create a public static method named "median" that
            receives three "double" parameters named "d0", "d1", and "d2".
            This method returns the median of these 3 values.
        1.3 create a public static method named "compute" that
            receives two "double" parameters named "d0" and "d1" and
            receives one "String" parameter named "operation".
            This method
            returns d0+d1 if "operation" is "sum", "add", or "plus";
            returns d0-d1 if "operation" is "difference", "subtract", or "minus";
            returns d0*d1 if "operation" is "product", "multiply", or "times";
            returns d0/d1 if "operation" is "division" or "by".
            Otherwise, this method throws a RuntimeException with a message
            "Invalid Operation". You must use "switch-case expression".
        1.4 create a public static method named "digitProduct" that
            receives an integer named "value" and returns the product of
            all of the digits in "value". However, if "value" contains digit 0,
            it skips digit 0. If "value" is negative, it returns -1 instead.
            Ex. digitProduct(3027) will return 42; digitProduct(0) will return 1.
         */
    }
}