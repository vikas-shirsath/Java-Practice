class SuperClass {
    void superClassMethod(Number n) {
        System.out.println("From Super Class");
    }
}

class SubClass extends SuperClass {
    void superClassMethod(Double d) {
        System.out.println("From sub class");
    }
}
public class MainClasses {
    public static void main(String [] args) {
        SubClass sub = new SubClass();
        sub.superClassMethod(123321.12);
        sub.superClassMethod(123321);
    }
}
