package KongRakSiamOOP;

public class Programmer extends OOPPratice {
    //Method
    public void showProgrammer() {

        setId("1");
        setName("Isolicez");
        setSalary(50000.0);

    }
    public String skill = "Java #C";
    //Constructor
    public Programmer(){

    }
    public Programmer(String id,String name,double salary){
        super(id,name,salary);
        System.out.println("I'm Programmer");

    }
}
