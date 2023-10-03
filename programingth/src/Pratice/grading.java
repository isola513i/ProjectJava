package Pratice;

import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your score: ");
        int collectScore = sc.nextInt();
        int midtermScore = sc.nextInt();
        int finalScore = sc.nextInt();
        int sum = collectScore+midtermScore+finalScore;
        if (sum >=80){
            System.out.println("A");
        } else if (sum >=75 ) {
            System.out.println("B+");
        } else if (sum >=74) {
            System.out.println("B");
        } else if (sum >=69) {
            System.out.println("C+");
        } else if (sum >=64) {
            System.out.println("C");
        } else if (sum >=59) {
            System.out.println("D+");
        } else if (sum >=54) {
            System.out.println("D");
        }else
        System.out.println("F");
    }
}


// -- Use Method -- //

//    public static void main(String[] args) {
//        System.out.println("Please Enter your score: ");
//        Calculate();
//    }

//    public static double Calculate() {
//        Scanner sn = new Scanner(System.in);
//        double num = sn.nextDouble();
//        double num2 = sn.nextDouble();
//        double sum = num + num2;
//
//        if (sum >= 80) {
//            System.out.println("A");
//        } else if (sum >= 70) {
//            System.out.println("B");
//        } else if (sum >= 60) {
//            System.out.println("C");
//        } else if (sum >= 50) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//        return 0;
//    }
//}

