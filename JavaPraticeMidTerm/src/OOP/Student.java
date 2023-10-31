package OOP;

public class Student {
    //  Attribute
    private int age;
    private String name;
    private String groupBlood;

    //  Constructor
    public Student(int age, String name, String groupBlood) {
        this.age = age;
        this.name = name;
        this.groupBlood = groupBlood;
    }

    //    Getter and Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupBlood() {
        return groupBlood;
    }

    public void setGroupBlood(String groupBlood) {
        this.groupBlood = groupBlood;
    }

    public String say(String message) {
        return name + " say " + message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", groupBlood='").append(groupBlood).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
