package Lesson5;

public class HW {
    public static void main(String[] args){
        BankAccount2 bA = new BankAccount2();
        bA.name = "Bob";
        bA.id = 1;
        bA.invoice= 30.3;
        bA.addMoney(10);
        System.out.println("Name: "+ bA.name +"\nAccount: " + bA.invoice+"\nid: "+bA.id);
    }
}

class BankAccount2{
    String name;
    int id;
    double invoice;
    double addMoney(double score){
        invoice+=score;
        return invoice;
    }
    double removeMoney(double score){
        invoice-=score;
        return  invoice;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.id = 1;
        emp1.name = "Bob";
        emp1.age = 30;
        emp1.salary = 1050;
        emp1.department = "Artist";

        emp2.id = 2;
        emp2.name = "Tom";
        emp2.age = 32;
        emp2.salary = 1150;
        emp2.department = "Art Lead";

        System.out.println("id: "+emp1.id +"\nName: "+ emp1.name +"\nage:"+emp1.age+"\nSalary: "+emp1.x2Salary()+"\nDepartment: "+emp1.department);
        System.out.println("id: "+emp2.id +"\nName: "+ emp2.name +"\nage:"+emp2.age+"\nSalary: "+emp2.x2Salary()+"\nDepartment: "+emp2.department);
    }

}
class Employee{
    int id;
    String name;
    int age;
    double salary;
    String department;
    double x2Salary(){
        salary*=2;
        return salary;
    }
}
