public class StringCharAt {
    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String fullname = firstName + " " + lastName;
            
        for(int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
