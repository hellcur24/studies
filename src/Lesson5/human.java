package Lesson5;

public class human {
    String name;
    vehicle car;
    BankAccount bA;

    void info(){
        System.out.println("Name: "+ name + "\nColor car"+car.color+"\nBank: " + bA.balance);
    }
}
class HumanTest{
    public static void main(String[] args) {
        human h = new human();
        h.name ="Sven";
        h.car = new vehicle("red", 3);
        h.bA = new BankAccount(1,3.12);
        h.info();
    }
}
class vehicle{
    vehicle(String c, double e){
        color=c;
        engine=e;
    }
    String color;
    double engine;
}
class BankAccount{
    BankAccount(int id2, double balance2){
        id=id2;
        balance=balance2;
    }
    int id;
    double balance;
}
