//Set the second bit (position = 1) of a number n. (n = 0101)

public class SetBitExample {
    public static void main(String[] args) {
        int bit = 5; //0101
        int position = 1;
        int bitMask = 1<<position;

        int newNumber = bit | bitMask;
        System.out.println(newNumber);
    
    }
}
