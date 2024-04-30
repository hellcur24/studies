package Lesson5;

public class Car3 {
    Car3(String color1, double engine1){
        color = color1;
        engine = engine1;

        System.out.println("Car color: "+ color+"\nCar engine: "+engine);
    }
    String color;
    double engine;

}
class CarTest{
    public static void main(String[] srgs){
        Car3 Car1 = new Car3("Black", 2.5);
        Car3 Car2 = new Car3("White", 5.0);

    }
}