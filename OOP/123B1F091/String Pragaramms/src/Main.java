import java.util.*;

public class Main {
    public static void countChars(String str){
        int count = str.length();
        System.out.println("String "+ str + " have " + count + " characters.");
    }

    public static void reverseTheString(String str) {
        char[] reverse = new char[str.length()];
        for (int i = (str.length()-1),j=0; i >=0 ; i++,j++) {
            reverse[j] = str.charAt(i);
        }
        String reverseString = new String(reverse);
        System.out.println("reverse of String is " + reverseString);
    }

    public static void countVovels(String str){
        int vovels = 0;
        int consonet = 0;
        for(int i=0; i<str.length(); i++) {
            char ab = str.charAt(i);
            if(ab == 'a' || ab == 'e'|| ab == 'i'|| ab == 'o'|| ab == 'u'|| ab == 'A' || ab == 'E' || ab == 'I' || ab == 'O' || ab == 'U') {
                vovels++;
            } else {
                consonet++;
            }
        }
        System.out.println("Number of vovels is " + vovels + " And number of consonents are " + consonet);
    }

    public static void main(String[] args) {
        String str = "Vikas";
        countChars(str);

        countVovels(str);

        reverseTheString(str);


    }
}
