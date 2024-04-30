package Lesson10;



class Test {
    int a = 1;
    static int b =2;
    static void abc(final int a){
        System.out.println(a);
        System.out.println(Test.b);
    }

    public static void main(String[] args) {
        abc(3);
    }
}

