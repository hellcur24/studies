package Lesson6;

public class Overloading {
    void show(int i1){
        System.out.println(i1);
    }
    void  show(boolean b1){
        System.out.println(b1);
    }
    void  show(String s1){
        System.out.println(s1);
    }
    void show(String s, int a){
        System.out.println("String: "+s+" int: "+a);
    }
}

class MethodOverloading{
    public static void main(String[] args) {
        Overloading mO = new Overloading();
        int a=500;
        mO.show(a);
        boolean b= true;
        mO.show(b);
        String s="Hi";
        mO.show(s);
        mO.show("Sa",2);
    }
}
