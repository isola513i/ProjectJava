package work01;

public final class Tool {
    public static double median(double d0, double d1, double d2) {


        if (d0 >= d1 && d0 <= d2 || d0 <= d1 && d0 >= d2) {
            return d0;
        }
        if (d1 >= d0 && d1 <= d2 || d1 <= d0 && d1 >= d2) {
            return d1;
        }
        if (d2 >= d0 && d2 <= d1 || d2 <= d0 && d2 >= d1) {
            return d2;
        }
        return 0;
    }

    public static double compute(double d0, double d1, String operation) {

        switch (operation) {
            case "sum", "add", "plus":
                return (d0 + d1);
            case "difference", "subtract", "minus":
                return (d0 - d1);

            case "product", "multiply", "times":
                return (d0 * d1);

            case "division", "by":
                return (d0 / d1);
            default:
                throw new RuntimeException("Invalid Operation");
        }


    }

    public static int digitProduct(int value) {

        int product = 1;

        if (value == 0) {
            return 1;
        }
        if (value < 0) {
            return -1;
        }

        while (value != 0) {
            product = product * (value % 10);

            value = value / 10;
        }
        return product;
    }
}



