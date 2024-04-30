package Lesson8;

public class Test1 {
    public final int a;//final - нельзя менять значение у А(и нет дефолтного значения)
    public final int b= 10;
    Test1(){ //конструктор класса Test1
        a = 10;//нужно обязательно, чтобы в конструкторе была определенна А

    }
    Test1(boolean b){//конструктор оверлодед для тест1
        a = 11;//нужно обязательно, чтобы в конструкторе была определенна А
    }
    public  void abc(final int s){//метод абс, s параметр при final нельзя изменить внутри метода
        final int b;
        b = 10;//нужно обязательно дать значение б
        System.out.println(s+b);
    }
    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.a);
        t.abc(1);
    }
}
