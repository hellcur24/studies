package Lesson5;

public class Car2 {
    String color;
    double engine;
    int speed;

    int raiseSpeed(int speed1){
        speed+=speed1;
        return speed;
    }
    int lowSpeed(int speed1){
        speed-=speed1;
        return speed;
    }
    void showInfo(){
        System.out.println("color: " + color + "\nengine: " + engine + "\nspeed: "+ speed);
    }
}
class Car2Test{
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "white";
        c1.engine = 1.3;
        c1.speed = 50;


        c1.raiseSpeed(20);
        c1.showInfo();
        c1.lowSpeed(10);
        c1.showInfo();
    }
        }
