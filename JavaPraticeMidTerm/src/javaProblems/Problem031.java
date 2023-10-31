package javaProblems;

public class Problem031 {
    // 5 Formula Math Function
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double triangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static double squareArea(double width) {
        return width * width;
    }

    public static double sphereArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double celsiusToKevin(double celsius) {
        return celsius + 273.15;
    }

    public static double kevinToCelsius(double kevin) {
        return kevin - 273.15;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return ((celsius * 9 / 5) + 32);
    }

    public static String checkGrade(int score) {
        if (score > 0) {
            if (score < 50) return "F";
            if (score < 60) return "D";
            if (score < 70) return "C";
            if (score < 80) return "B";
            if (score < 100) return "A";
        }
        throw new RuntimeException("Invalid Score");
    }

    public static double calculateBMI(double weight, double height) {
        return (weight / (height * height));
    }

    public static String checkBMI(double weight, double height) {
        double BMI = (weight / (height * height));
        if (BMI < 18.6) return "Underweight";
        if (BMI < 25) return "Normal weight";
        if (BMI < 30) return "Overweight";
        if (BMI > 30) return "Obesity";
        return "Invalid BMI";
    }

    public static boolean checkName(String name) {
        if (name.equalsIgnoreCase("WeLoveKK")) return true;
        return false;
    }

    public static boolean checkOddOrEvenNumber(int number) {
        if (number%2 == 0) return false;
        return true;
    }
    public static boolean checkLeapYear(int year){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) return true;
        return false;
    }


}

