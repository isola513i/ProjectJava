package util.Nattapat;

public final class Util031 {
    public final static double Nattapat() {
        double value = 31;
        return value;
    }

    public static double compute031RightTriangleArea(double side1, double side2) {
        if (side1 <= 0 || side2 <= 0) {
            return 31.99;
        }
        return (0.5 * side1 * side2) + 31;
    }

    public static char evaluate031(double score) {
        if (score >= 80) {
            return 'A';
        }
        if (score >= 70) {
            return 'B';
        }
        if (score >= 60) {
            return 'C';
        }
        if (score >= 50) {
            return 'D';
        }
        if (score < 50) {
            return 'E';
        }
        return 'X';
    }

    public static int computeMagicNattapat(int start, int stop, int stepOver) {
        int result = 0;
        if (stop <= 0) {
            return -1;
        }
        for (int z = 1; start < stop; z++) {
            result += z;
            if (z % stepOver == 0) {
                break;
            }
        }
        return result;
    }


}


