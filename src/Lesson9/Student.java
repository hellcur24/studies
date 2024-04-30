package Lesson9;

public class Student {
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6;//не создает объект
        st1=null;//удаляем адрес к объекту
        st1=new Student();//создаем новый адрес к объекту
    }
}
