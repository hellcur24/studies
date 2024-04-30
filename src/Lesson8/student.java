package Lesson8;

public class student {
    String name;
    int course;
    int a;
    static int count;// количество принадлежит только к одному классу студент, только при использовании (count общая переменная), name и course создаются по новому каждый раз, а count один на всех
    public student(String name, int course){//конструктор класс
        count++;//когда мы создаем нового студента, у нас увеличивается количество студентов,
        this.name= name;
        this.course = course;
        System.out.println("Student "+count+" created");
    }
    public static void showCount(){
        //a++;Я не могу использовать а, т.к. showCount всегда существет, но А может не существовать из-за этого он запрещает ее использовать
        student st11= new student("Asf",1);//чтобы использовать А, нужно создать объект.
        st11.a++;

        count ++;
        System.out.println("All: "+ count);
    }
    void abx(){//метод abx
        a++;
        count ++;
    }
    public static void showInfo(){//создали публичный метод, который не возвращает ничего (void), которая нельзя пересоздать и изменения происходят и сохранятся в этом методе
        System.out.println("Hello All new student");
    }

}

class StudentAdd{
    public static void main(String[] args) {
        student st1 = new student("Olaf",2);
        student st2 = new student("Bob", 3);
        student st3 = new student("Anna", 1);

        System.out.println(st1.name);
        System.out.println(student.count);//из-за static мы можем ссылаться на сам класс, а не на st1,st2...
        System.out.println(student.count);

        student.showCount();//используя static можно и к методам
    }

}
