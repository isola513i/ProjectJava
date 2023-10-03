package Int101Week06;

import Int101Week06.geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your Grade is " + evaluateGrade(80));
        System.out.println("10 = " + demoSwitchCase(100));
        evaluateGrade(0);
    }

    public static char demoSwitchCase(int x) {
        char y = 'a';
        switch (x) {
            case 1:
                y = 'o';
                break;
            case 2:
                y = 't';
                break;
            case 3:
                y = 't';
                break;
            case 4:
                y = 'f';
                break;
            case 5:
                y = 'f';
                break;
            case 6:
                y = 's';
                break;
            case 10:
                y = 't';
                break;

        }
        return y;
    }

    public static void demoRectangle() {
        System.out.println("My Rectangle = " + new Rectangle(4, 9));
        System.out.println("My Rectangle = " + new Rectangle(5, 3));
        try {
            System.out.println("My Rectangle = " + new Rectangle(-5, 3));
        } catch (Exception e) {
            System.out.println("An exception occurs.");
        }
        System.out.println("DONE");
    }

    public static char evaluateGrade(double s) {
        if (s > 100 || s < 0) return 'X';
        if (s >= 80) return 'A';
        if (s >= 70) return 'B';
        if (s >= 60) return 'C';
        if (s >= 50) return 'D';
        return 'E';

    }


}