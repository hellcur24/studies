package lesson4;

public class Car {
    Car(String color1, double engine1){
        color = color1;
        engine = engine1;

        System.out.println("Car color: "+ color+"\nCar engine: "+engine);
    }
    String color;
    double engine;

}
class CarTest{
    public static void main(String[] srgs){
        Car Car1 = new Car("Black", 2.5);
        Car Car2 = new Car("White", 5.0);

    }
}
