import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        int [] nums = new int[5];
        String str = null;
        
        try
        {
            j = 18/i;
            if(j == 0) {
                throw new ArithmeticException("I don't want to print 0.");
            }
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("Thats the default output" + e);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit");
        }
        catch(Exception e) {
            System.out.println("Something went wrong" + e);
        } // parent should be at bottom

        System.out.println(j);

        System.out.println("Bye");

    }    
}