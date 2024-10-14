@FunctionalInterface
interface A {
    void show();
}

// class B implements A {
//     public void show() {
//         System.out.println("in show ");
//     }
// }

public class Main {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In show ");
            }
        };

        obj.show();
    }    
}
