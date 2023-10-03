package Phase1;

public class Variable {
    public static void main(String[] args) {
        // Global variable
        int a = 100;
        int b = 200;
        System.out.println(a);
        {
            // Local Variable
            int c = 300;
            System.out.println(c);
            System.out.println("You can Use Global variable a = " + a);
        }

        // System.out.println(c); ไม่ได้อยู๋ในขอบเขตที่ประกาศตัวแปร c
        System.out.println(b);
        System.out.println("-----------------------------------------------");

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println();
    }
}
