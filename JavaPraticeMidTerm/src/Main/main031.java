package Main;

import OOP.Employee;

import static Function.math.MathFunc031.*;
import static Function.utils.Utils031.checkInteger;
import static Function.utils.Utils031.checkString;
import static displayDetail.Display031.*;
import static javaProblems.Problem031.*;
import static javaType.Type031.*;


public class main031 {
    public static void main(String[] args) throws IllegalAccessException {

        // Function Math
        System.out.println("add " + add(10, 20));
        System.out.println("subtract " + substract(20, 30));
        System.out.println("multiply " + multiply(30, 40));
        System.out.println("divide " + divide(20, 40));
        System.out.println("---------------------------------------------------------------------------------");
        // Function Utils
        System.out.println("Check String " + checkString(""));
        System.out.println("Check Int " + checkInteger(10));
        System.out.println("---------------------------------------------------------------------------------");
        // Java Type
        System.out.println("Int Type " + intType(1));
        System.out.println("Long Type " + longType(99999999L));
        System.out.println("Double Type " + doubleType(3.14));
        System.out.println("Boolean Type " + true);
        System.out.println("Char Type " + charType('K'));
        System.out.println("String Type " + stringType("Hello World"));
        System.out.println("---------------------------------------------------------------------------------");
        // Display Detail
        System.out.println("Name Display " + nameDisplay("Ice"));
        System.out.println("Age Display " + ageDisplay(18));
        System.out.println("GroupBlood Display " + groupBloodDisplay('O'));
        System.out.println("All Display " + allDisplay("Ice", 18, 'O'));
        System.out.println("---------------------------------------------------------------------------------");
        //Problems
        System.out.println("Your Grade is " + checkGrade(99));
        System.out.println("Circle Area is " + circleArea(5));
        System.out.println("Triangle Area is " + triangleArea(5, 10));
        System.out.println("Rectangle Area is " + rectangleArea(5, 10));
        System.out.println("Square Area is " + squareArea(5));
        System.out.println("Celsius To Kevin is " + celsiusToKevin(35));
        System.out.println("Kevin To Celsius is " + kevinToCelsius(273));
        System.out.println("Celsius To Fahrenheit is " + celsiusToFahrenheit(35));
        System.out.println("Calculate BMI: " + calculateBMI(77, 1.7));
        System.out.println("Check BMI: " + checkBMI(77, 1.7));
        System.out.println("Check Name : " + checkName("WeLoveKK"));
        System.out.println("Check Leap Year: " + checkLeapYear(2015));
        System.out.println("---------------------------------------------------------------------------------");
        //OOP
        Employee employee1 = new Employee("Nattapat", "Lamnui", 18, 31);
        System.out.println(employee1);
        System.out.println(employee1.getFname());
        System.out.println(employee1.getLname());
        System.out.println("Ages: " + employee1.getAge());
        System.out.println("Set salary: " + employee1.setSalary(10000));
        System.out.println("Salaryb efore adding bonus: " + employee1.getSalary());
        System.out.println("Set bonus: " + employee1.setBonus(5000));
        System.out.println("Get bonus: " + employee1.getBonus());
        System.out.println("Bonus after adding: " + employee1.addBonus(10000));
        System.out.println("Get final salary: " + employee1.getFinalSalary());
        System.out.println("Add age: " + employee1.addAge());
        System.out.println("Ages after adding: " + employee1.getAge());
        System.out.println("Full name is " + employee1.getFullname());
        System.out.println("Get salary per day: " + employee1.getSalaryPerDay());
        System.out.println("Get salary per week: " + employee1.getSalaryPerWeek());
    }
}
