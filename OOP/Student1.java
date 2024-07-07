class Student {
    String name;
    int age;

    public void getInfo() {
        System.out.println("Name of Student is " + this.name);
        System.out.println("Age of Student is " + this.age);
    }
}

public class Student1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vikas";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "knewka";
        s2.age = 21;

        s1.getInfo();
        s2.getInfo();
    }
}