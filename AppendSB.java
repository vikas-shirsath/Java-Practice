import java.util.*;

public class AppendSB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e"); //str = str + "e"; in string everytime new string get formed hence it takes more time. thus we use string builder for saving time.
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
    }   
}