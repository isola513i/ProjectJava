package Function.utils;

public class Utils031 {
    public static boolean checkString(String checkName) {
        if (checkName == null || checkName.isBlank()) {
            return false;
        }
        return true;
    }

    public static boolean checkInteger(int checkInt) throws IllegalAccessException {
        if (checkInt == 0 || checkInt < 0) {
            return false;
        }
        return true;
    }
}




