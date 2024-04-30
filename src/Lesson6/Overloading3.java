package Lesson6;

public class Overloading3 {
    int sum(int a,int b, int c){
        return a+b+c;
    }
    int arf(int x, int y, int z){
        return sum(x,y,z)/3;
    }
}
