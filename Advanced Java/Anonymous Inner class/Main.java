class A {
    public void show() {
        System.out.println("In a class");
    }
}


public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In a new show");
            }
        };

        obj.show();
    }
}