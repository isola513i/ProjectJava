package Pratice;

import java.util.Scanner;

public class abProblem {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter number of A and b");
        int a = sn.nextInt();
        int b = sn.nextInt();
        int sum = a+b;

        System.out.println("A+B = " + sum);
    }
}
