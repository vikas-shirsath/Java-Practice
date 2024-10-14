class A {
    public void showTheDataBelongsToThisClass() {
        System.out.println("In A show...");
    }

}

class B extends A{
    @Override  //Annotation
    public void showTheDataBelongsToThisClass() {
        System.out.println("In B Show");
    }
}


public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataBelongsToThisClass();
    }    
}
