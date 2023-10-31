package Obj.Nattapat;

public class obj031 {
    private static String id031;
    private static String nameNattapat;
    private static double value031;

    public obj031(String id031, String nameNattapat, double value031) {
        obj031.id031 = id031;
        obj031.nameNattapat = nameNattapat;
        obj031.value031 = value031;
    }

    public static int compare(obj031 o1, obj031 o2) {
        if (o1.value031 == o2.value031) {
            return 0;
        }
        if (o1.value031 < o2.value031) {
            return -1;
        }
        return 1;
    }

    public boolean isGreaterThan(obj031 o) {
        if (value031 > o.value031) {
            return true;
        }
        return false;
    }


    public static String getId031() {
        return id031;
    }

    public static void setId031(String id031) {
        obj031.id031 = id031;
    }

    public static String getNameNattapat() {
        return nameNattapat;
    }

    public static void setNameNattapat(String nameNattapat) {
        obj031.nameNattapat = nameNattapat;
    }

    public static double getValue031() {
        return value031;
    }

    public static void setValue031(double value031) {
        obj031.value031 = value031;
    }

    @Override
    public String toString() {
        return "obj031{" + '}';
    }


}
