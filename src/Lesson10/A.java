package Lesson10;
import Lesson8.*;
import Lesson9.Car;
import Lesson9.Student;
import java.lang.*;//дефолтный пакет, который java всегда импортирует сама
import Lesson9.*;//* означает, что будет импортироваться все классы из пакета
import static lesson3.Lesson10.BB.a;//можно работать и выводить значение из класса bb в пакете лессон 3 и подпакетом лессон 10
//import static lesson3.Lesson10.BB.* все значения переносим
/**
Использование для описываение класса, потом можно перенести в README
 */
public class A {
    public static void main(String[] args) {
        Car c1 = new Car("red",1.3);//если создаем импорт, то можно записывать без lesson9,пакет и в нем класс
        Lesson9.Car c2 = new Lesson9.Car("Black",2.0);//если не указали импорт, то нужно писать полный путь к пакету(папке)
        Lesson8.Car c3 = new Lesson8.Car();//если у пакетов есть одинаковые имена классов, то мы обязаны использовать полное название пути
        Student st1 = new Student();
        Lesson9.Student st2 = new Lesson9.Student();
        System.out.println(a);
    }
}
class B{
    Student st4 = new Student();//на этот класс тоже распространяются импорты
        }