package utils;

public class MyUtils {

    public static void main(String[] args) {
        System.out.println(MyUtils.isPositive(5));
    }

    private static boolean isPositive(int number) {
        if (number > 0) return true;

        return false;
    }

}
