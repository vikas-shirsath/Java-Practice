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


        if(s == Status.Running) {
            System.out.println("All good");
        } else if (s == Status.Failed) {
            System.out.println("Try again");
        } else if (s == Status.Pending) {
            System.out.println("Please wait");
        } else {
            System.out.println("Done");
        }


        switch(s) {
            case Running:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("PLease wait");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
