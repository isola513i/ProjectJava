package JavaSimplePratice;

public class Loop {
    public static void main(String[] args) {
//        Loop 1 to 10

//        for(int i = 1;i <= 10; i++){
//            System.out.println(i);
//        }
//    }
//        Find sum of 1 to 10

//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//            System.out.println(sum);
//        }

//        Loop 1 to 10 skip odd

//        for(int i = 1; i <= 10; i++){
//            if (i % 2 != 0) {
//                continue;
//            }
//            System.out.println(i);
//        }

//      Loop 2 to 22 if found 0 then break out loop
        for (int i = 2; i <= 22; i++) {
            if (i % 10 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
