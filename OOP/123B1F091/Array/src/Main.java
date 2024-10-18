import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[5];
        for (int i = 0; i < 4; i++) {
            arr[i] = i;
        }
        arr[4] = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();


        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int [] arr1 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        int count=0;
        int [] temp = new int[5] ;
        for (int i = 0, k=0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                       flag = false;
                       count ++;
                }
            }
            if(flag) {
                temp[k] = arr[i];
                k++;
            }
        }
        System.out.println(temp.length);
        arr = temp;
        count = arr.length-count;
        for (int i = 0; i < arr.length; i++) {
            if(i == count) {
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}