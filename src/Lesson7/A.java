package Lesson7;

import Lesson6.Employee;

public class A {
    public static void main(String[] args) {
        B object = new B(); // вызов класса в одном пакете
        Lesson6.Employee emp = new Lesson6.Employee("Bob",32); // вызов класса из другого пакета


    }
}
