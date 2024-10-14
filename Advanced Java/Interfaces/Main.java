interface A {
    int age = 19; // final and static

    void show();
    void config();
}

interface X {
    void run();
}

interface Y extends X {
    
}

class B  implements A,Y{

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("Running...");
    }

}

public class Main {
    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.config();
        obj.show();

        System.out.println(A.age);

        X obj1 = new B();
        obj1.run();
    }
}


//class - class --> extends
//calss - interface ==> implements
//interface - interface --> extends