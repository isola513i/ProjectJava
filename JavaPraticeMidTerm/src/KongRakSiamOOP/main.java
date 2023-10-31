package KongRakSiamOOP;

public class main {
    public static void main(String[] args) {
        OOPPratice e1 = new OOPPratice("1", "Ice", 30000.0); // Create Object Syntax: ชื่อ class + ตั้งชื่อ + = + new + ชื่อคลาส
        e1.displayEmployee();
        System.out.println(" ");
        OOPPratice e2 = new OOPPratice("2", "Dear");
        e2.displayEmployee();
        System.out.println(" ");
        System.out.println(e1.getName());
        System.out.println("ID: " + e1.getId());
        System.out.println("Salary of Ice is " + e1.getSalary());
        System.out.println(" ");
        System.out.println(e2.getName());
        System.out.println("ID: " + e2.getId());
        System.out.println("Salary of Dear is " + e2.getSalary());
        OOPPratice e3 = new OOPPratice();
        System.out.println(" ");
        int result = OOPPratice.minSalary;
        System.out.println("Min salary: " + result);
        System.out.println(" ");
        Programmer p1 = new Programmer("1","Isolicez",130000);
        System.out.println(" ");
        System.out.println(Company.name);
        System.out.println(Company.createAt);
//        System.out.println(Company.name = SainuaStudio); แก้ไขไม่ได้เพราะประกาศ Final
    }
}
