enum Status {
    Running, Failed, Pending, Success; // also have order
}


public class Main {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s.ordinal()); 
        System.out.println(s);

        Status[] s1 = Status.values();
        System.out.println(s1[0]);

        for(Status s2: s1) {
            System.out.println(s2 + " : " + s2.ordinal());
        }
    }
}
