package Lesson8;

public class Car {
    String color = "Blue";
    double engine = 1.3;
}
class Human{//новый класс человек
    String name = "Bs";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        //h1.c=new Car();если final машина, то мы не можем изменить путь, но мы можем изменить значение внутри машина
        //h1.c=new Car();
        h1.c.engine= 1.8;
    }
}
