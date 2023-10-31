package JavaSimplePratice;

public class Method {
    public static void main(String[] args) {
       double resultMiles =  kmToMiles(10);
       double resultMiles2 = kmToMiles(20);
       double allMiles = resultMiles2 + resultMiles;
       double resultKm = milesToKm(200);
        System.out.println(resultKm);


        System.out.println(allMiles);
    }
//    Method
    static double kmToMiles(double km) {
        double miles = km / 1.6;
        return miles;
    }
    static double milesToKm(double miles){
        return miles * 1.6;
    }
}
