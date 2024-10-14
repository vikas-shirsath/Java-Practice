interface A {
    int age = 19; // final and static

    void show();
    void config();
}

class B  implements A{

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

}

public class Main {
    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.config();
        obj.show();

        System.out.println(A.age);
    }
}