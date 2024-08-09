// Clear the third bit (position = 2) of a number n. (n = 0101)

public class ClearBitExample {
    public static void main(String[] args) {
        int n = 5; //0101
        int  pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}