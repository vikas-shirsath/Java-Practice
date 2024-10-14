@FunctionalInterface
interface A {
    int show(int i, int j);
}

// class B implements A {
//     public void show() {
//         System.out.println("in show ");
//     }
// }

public class Main {
    public static void main(String[] args) {
        A obj = (i, j) -> i+j;

        int result = obj.show(5, 4);
        System.out.println(result);
    }    
}


//lambda expression only works with fuctional interfaces