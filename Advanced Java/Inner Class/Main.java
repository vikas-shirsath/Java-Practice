class A {  //cant make outer class static
    int age;

    public void show() {
        System.out.println("in show")
    }

    class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class Main {
    public static void main(String args[]) {
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B(); //if B is static new A.B()
        obj1.config();

    }
}