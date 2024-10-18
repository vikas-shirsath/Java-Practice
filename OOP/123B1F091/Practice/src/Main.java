import java.lang.*;

public class Main {

    public static void randomNoGen() {
//        int a = (int)Math.random();
//        System.out.println(a);

        int max = 10;
        int min = 1;
        int range = max - min -1;
        int rand = (int) (Math.random() * range) + min;
        System.out.println(rand);
    }

    public static void autoMorphic() {
        int no = 25;
        int count = 0;
        int temp = no;
        while(temp!=0) {
            count++;
            temp/=10;
        }
        int lastSqNo = (no*no) % (int)Math.pow(10,count);
        if(no == lastSqNo) {
            System.out.println("automorphic");
        } else {
            System.out.println("not automorphic");
        }
    }

    public static void spy() {
        int no = 1124;
        int sum = 0;
        int product = 1;
        int temp = 1124;
        while(temp!=0) {
            int temp1 = temp % 10;
            sum += temp1;
            product *= temp1;
            temp /= 10;
        }
        if(sum == product) {
            System.out.println("spy");
        } else {
            System.out.println("Not spy");
        }
    }


    public static void perfectNo() {
        int no = 6;
        int sumOfFactors = 0;
        for (int i = 1; i < no; i++) {
            if(no % i == 0) {
                sumOfFactors += i;
            }
        }
        if (sumOfFactors == no) {
            System.out.println("perfect");
        } else {
            System.out.println("not perfect ");
        }
    }


    public static void main(String[] args) {
        randomNoGen();
        autoMorphic();
        spy();
        perfectNo();
    }
}