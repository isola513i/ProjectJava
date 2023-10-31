package OOP;

import java.util.Objects;

import static Function.utils.Utils031.*;

public class Employee {
    //    Attributes
    private String fname;
    private String lname;
    private int age;
    private int salary;
    private int bonus;
    private final int id;

    //    Constructor
    public Employee(String fname, String lname, int age, int id) throws IllegalAccessException {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        if (checkInteger(age)) {
            this.age = age;
        } else throw new IllegalAccessException("Age must be positive");

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        if (checkString(fname)) {
            this.fname = fname;
        }

    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        if (checkString(lname)) {
            this.lname = lname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAccessException {
        if (checkInteger(age)) {
            this.age = age;
        }
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public int setBonus(int bonus) {
        this.bonus = bonus;
        return bonus;
    }

    public int addBonus(int bonus) {
        return this.bonus += bonus;
    }

    public int getFinalSalary() {
        return salary += bonus;
    }

    public int addAge() {
        return age += 1;
    }

    public String getFullname() {
        return (fname + " " + lname);
    }

    public int getSalaryPerDay() {
        int salary2 = this.salary;
        return salary2 /= 30;
    }

    public int getSalaryPerWeek() {
        int salary2 = this.salary;
        return salary2 /= 4;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("fname='").append(fname).append('\'');
        sb.append(", lname='").append(lname).append('\'');
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", bonus=").append(bonus);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && bonus == employee.bonus && id == employee.id && Objects.equals(fname, employee.fname) && Objects.equals(lname, employee.lname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fname, lname, age, salary, bonus, id);
    }

}
