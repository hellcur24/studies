package Lesson5;

public class StudentTest {
    int id;
    String name;
    int course;
    StudentTest(int id, String name, int course1){
        this.id=id; //use "this" if we use id out of constructor (inside class)
        this.name = name;
        course = course1;
    }
    StudentTest(int id, String name){
        this(id,name, 0);
    }
    StudentTest(){
        this(0,null,0);
    }
    int summ(int a,int b,int c){
        int sum1 = a+b+c;
        return sum1;
    }
    int arvn(int a1, int b1, int c1){
        int result = summ(a1, b1, c1)/3;
        return result;
    }

}
class Test21{
    public static void main(String[] args) {
        StudentTest t = new StudentTest();
        StudentTest t1 = new StudentTest(1,"Stevi");
        StudentTest t2 = new StudentTest(2, "Bob", 2);
        int Calculate = t.summ(1,2,3);//constructor
        System.out.println(Calculate);
        System.out.println(t.arvn(1,2,3));
        System.out.println("Student name: "+t.name+ " id: "+t.id+" course: "+t.course);
        System.out.println("Student name: "+t1.name+ " id: "+t1.id+" course: "+t1.course);
        System.out.println("Student name: "+t2.name+ " id: "+t2.id+" course: "+t2.course);

    }
}
