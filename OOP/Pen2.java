class Pen {
    String colour ;

    public void printcolour() {
        System.out.println("The colour of this pen is " + this.colour);
    }
}


public class Pen2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.colour = "blue";

        Pen p2 = new Pen();
        p2.colour = "black";

        Pen p3 = new Pen();
        p3.colour = "red";

        p1.printcolour();
        p2.printcolour();
        p3.printcolour();
    }
}