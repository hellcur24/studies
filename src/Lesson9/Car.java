package Lesson9;

public class Car {
    int ssssssssssssssssssssss = 5;
    int $Sdf=4;
    int _12 = 5;
    int ad =1;

    String color;//инстанс переменная, она видна во всем классе кар, в любом методе (можно использовать this, чтобы показать)
    double engine;
    int a = 10;
    static int count; //она видна везде в классе кар, и существует только одна

    public static void changeA(int b){//пример обращения
        Car c = new Car("black", 3.5);
        c.a=b;
    }

    public Car(String color, double engine) {//конструктор
        int x = 5;
        int y = x+10;
        count++;
        this.color = color;
        this.engine = engine;
    }
    public void showColor(){
        System.out.println("Car color is: "+ color);
        this.changeColor("blue");//можно не писать this, java понимает, что мы ищем метод в классе кар

    }
    public void changeColor(String color){
        System.out.println("Color changed");
        int cost = 1000; //Локальная переменная, т.к. она создана во внутри класса (видно только внутри метода и после написания)
        this.color = color;
        cost += 500;
        System.out.println(color);

    }

    public static void main(String[] args) {
        Car c=new Car("Red", 1.1);
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);
    }

}

