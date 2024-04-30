package Lesson7;

public class Employee {
    public double salary;
    public void extraSalary(){//method extraSalary

        System.out.println("New salary is: "+ salary*2);
    }
    public Employee(double salary){//конструктор Employee
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.extraSalary();
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee emp = new Employee(600);
        System.out.println(emp.salary);
        emp.extraSalary();
    }
}
