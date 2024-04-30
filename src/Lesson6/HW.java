package Lesson6;

public class HW {
   int sum(){
       int result = 0;
       System.out.println("Summ: " + result);
       return result;
   }
    int sum(int a){
        int result = a;
        System.out.println("Summ: " + result);
        return result;
    }
    int sum(int a, int b){
        int result = a + b;
        System.out.println("Summ: " + result);
        return result;
    }
    int sum(int a, int b, int c){
        int result = a + b + c;
        System.out.println("Summ: " + result);
        return result;
    }
    int sum(int a, int b, int c, int d){
        int result = a + b + c +d;
        System.out.println("Summ: " + result);
        return result;
    }
}

class summ1{
    public static void main(String[] args) {
        HW hw = new HW();
        hw.sum();
        hw.sum(2);
        hw.sum(2,3);
        hw.sum(3,2,1);
        hw.sum(1,1,1,1);

    }
}