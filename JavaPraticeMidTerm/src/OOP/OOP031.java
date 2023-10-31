package OOP;

public class OOP031 {
    static Student student1 = new Student(18, "Ice", "O");

    public static void main(String[] args) {
//        Student OOP
        System.out.println(student1);
        System.out.println(student1.say("I Love you"));
        System.out.println(" ");
//        How To setName Student1
        student1.setName("Karn");
        System.out.println("Change student name to " + student1.getName());
        System.out.println(" ");
//        How To setAge Student1
        student1.setAge(25);
        System.out.println("Change student ages to " + student1.getAge());
        System.out.println(" ");
//        How To setGroupblood Student1
        student1.setGroupBlood("AB");
        System.out.println("Change student groupblood to " + student1.getGroupBlood());
        System.out.println(" ");
//        New Object Student
        Student student2 = new Student(10, "Buss", "B");
        System.out.println(student2);
        System.out.println("Compare that student1 and student2 are same : " + student1.equals(student2));

    }

}
