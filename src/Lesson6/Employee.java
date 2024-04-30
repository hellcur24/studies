package Lesson6;

import java.time.chrono.MinguoDate;

public class Employee {
    Employee(int id1, String surname1, int age1){
        this(id1,surname1, age1,0.0,null); // this == Employees
    }
    Employee(int id3, String surname3, int age3, double salary3, String department3){
        //this(id3, surname3, age3); // this == Employees
        salary=salary3;
        department=department3;
        id = id3;
        surname = surname3;
        age = age3;
        salary=salary3;
        department=department3;

    }
    public Employee(String surname2, int age2){
        surname=surname2;
        age=age2;
    }
    int id;
    String surname;
    int age;
    double salary;
    String department;

}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Bob", 34);
        System.out.println(emp.id);
        Employee emp2= new Employee("Bob",10);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(2, "Sven", 49,100.1,"IT");
        System.out.println(emp3.department);
    }
}