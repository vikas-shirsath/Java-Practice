class A extends Thread{
    public void run() { 
        for(int i=0; i<100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run() {
        for(int i = 0; i<100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
    
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();

    }    
}