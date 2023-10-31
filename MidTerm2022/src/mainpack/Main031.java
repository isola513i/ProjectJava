package mainpack;

import Obj.Nattapat.obj031;
import util.Nattapat.Util031;

import static Obj.Nattapat.obj031.*;
import static util.Nattapat.Util031.*;

public class Main031 {
    public static void main(String[] args) {

        testIsGreaterThan();
        testEvaluate031();
        testComputeMagicNattapat();
        testConstructor();

    }
    public static void testConstructor(){
        System.out.println("Constructor: " + new obj031("032","Ice",555));
    }
    public static void testCompare(){
        var o1 = new obj031("id031","Ice",3133);
        var o2 = new obj031("id035","Potae",311);
        System.out.println("Compare: " + compare(o1,o2));
    }
    public static void testIsGreaterThan(){
        var o1 = new obj031("id031","Ice",3133);
        var o2 = new obj031("id035","Potae",311);
        System.out.println(o1.isGreaterThan(o2));
    }
    public static void testCompute031RightTriangleArea(){
        System.out.println("Compute right triangle area: " + compute031RightTriangleArea(10,20));
    }
    public static void testEvaluate031(){
        System.out.println("Evaluate grade: " + evaluate031(80));
    }
    public static void testComputeMagicNattapat(){
        System.out.println("Compute magic: " + computeMagicNattapat(1,10,2));
    }
}
