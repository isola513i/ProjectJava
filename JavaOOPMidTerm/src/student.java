import java.lang.reflect.Constructor;

public class student {
    private String name;
    private int studentId;

    //    Constructor
    public student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void sayHello() {
        System.out.println(getName() + " is saying Hello to you");
    }

    @Override
    public String toString() {
        return "Student(" + getName() + "," + getStudentId() + ") is SIT Student";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        student another = (student) obj;
        if (this.name.equalsIgnoreCase(another.getName())) {
            return true;
        }

        return false;
    }
}