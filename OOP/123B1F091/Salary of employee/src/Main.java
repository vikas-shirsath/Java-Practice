import java.util.*;
import java.util.Scanner;
class emp {
    Scanner sc = new Scanner(System.in);
    String Designation;
    double BS,TS ;
    double HRA,TA;

    void printIt(double TS) {
        System.out.println(TS);
    }

    void getIt(){
        Designation = sc.next();
        BS = sc.nextDouble();

        calc(BS);
    }

    void calc(double BS) {
        TA = 0.05*BS;
        HRA = TA;
        TS = TA + BS + HRA;
        printIt(TS);
    }


//    emp() {
//        this.Designation = Designation;
//        this.BS = BS;
//        this.TS = TS;
//        this.TA = TA;
//        getIt();
//    }

}

public class Main {
    public static void main(String[] args) {
        emp emp1 = new emp();
        emp1.getIt();
    }
}