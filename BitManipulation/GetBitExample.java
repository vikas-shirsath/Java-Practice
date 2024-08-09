//Get the third bit (position = 2) of a number n. (n = 0101)

public class GetBitExample {
    public static void main(String[] args) {
        int bit = 5;//0101
        int position = 2;
        int bitMask = 1<<position;

        if ((bitMask & bit) == 0) {
            System.out.println("Bit Was 1");
        } else {
            System.out.println("Bit is 1");
        }
    }
}