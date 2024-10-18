import java.util.Scanner;

public class StringConcat {

    public String concat(String a, String b) {
        return a + b;
    }

    public String concat(String a, String b, String c) {
        return a + b + c;
    }

    public String concat(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringConcat sc = new StringConcat();

        System.out.print("Enter the first string: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String second = scanner.nextLine();
        System.out.println(new StringBuilder().append("Concatenated result (2 strings): ").append(sc.concat(first, second)).toString());

        System.out.print("Enter the first string: ");
        String third = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String fourth = scanner.nextLine();
        System.out.print("Enter the third string: ");
        String fifth = scanner.nextLine();
        System.out.println("Concatenated result (3 strings): " + sc.concat(third, fourth, fifth));

        System.out.print("How many strings do you want to concatenate? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }
        System.out.println("Concatenated result (array of strings): " + sc.concat(words));

        scanner.close();
    }
}
