import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String str = "vikas ";
        String str1 = "Shirsath";
        String str2 = "VIKAS";

        System.out.println(str.charAt(0));

        String sub = str.substring(3);
        System.out.println(sub);

        String sub1 =str.substring(0,4);
        System.out.println(sub1);

        boolean isContains = str.contains(sub1);
        System.out.println(isContains);

        boolean isEequals = str.equals(str2);
        System.out.println(isEequals);

        boolean isSame = str.equalsIgnoreCase(str2);
        System.out.println(isSame);

        boolean checkEptyness = str.isEmpty();
        System.out.println(checkEptyness);

        String str3 = str.concat(str1);
        System.out.println(str3);

        String str4 = str.replace('v', 'V');
        System.out.println(str4);

        int index = str.indexOf('V');
        System.out.println(index);

        int index1 = str.indexOf('s', 2);
        System.out.println(index1);

        str2 = str2.toLowerCase();
        System.out.println(str2);

        str = str.toUpperCase();
        System.out.println(str);

    }
}
