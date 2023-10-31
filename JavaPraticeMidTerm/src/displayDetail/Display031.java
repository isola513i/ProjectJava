package displayDetail;

public class Display031 {

    public static String nameDisplay(String name) {
        return name;
    }

    public static int ageDisplay(int age) {
        return age;
    }

    public static char groupBloodDisplay(char groupBlood) {
        if (groupBlood != 'A' && groupBlood != 'B' && groupBlood != 'O' && groupBlood != 'A' + 'B') {
            throw new RuntimeException("It not a group blood");
        }
        return groupBlood;
    }

    public static String allDisplay(String name, int age, char groupBlood) {
        return name + " " + age + " " + groupBlood;
    }
}
