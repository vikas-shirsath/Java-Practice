//update the second bit (position = 1) of a number n. (n = 0101)

import java.util.*;

public class UpdateBitExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        //operation = 1 : set operation and operation = 0 : clear
        int n = 5; //0101 --> 0111 --> decimal 7
        int pos = 1;

        int bitMask = 1 << pos;
        if (operation == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}