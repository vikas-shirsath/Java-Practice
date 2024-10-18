class Person {
    String name;
    int age;
    Person(String name,int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    String id;
    Student(String name,int age, String id) {
        super(name, age);
        this.id = id;
    }
}
class GradStudent extends  Student {
    int marks;
    GradStudent(String name,int age, String id, int marks) {
        super(name, age, id);
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        GradStudent g1 = new GradStudent("vikas",19,"123B1F091",98);
        System.out.println(g1.name);
        System.out.println(g1.age);
        System.out.println(g1.id);
        System.out.println(g1.marks);
    }
}