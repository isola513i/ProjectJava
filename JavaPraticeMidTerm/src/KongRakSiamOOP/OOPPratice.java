package KongRakSiamOOP;

public class OOPPratice {
    //  Attribute
    private String id;
    private String name;
    private double salary;

    //  Static Attribute

    static int minSalary = 12000;

    //  Default Constructor กำหนดค่าเริ่มต้น
    public OOPPratice() {

    }

    public OOPPratice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public OOPPratice(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        displayEmployee();

    }

    //  Method
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
