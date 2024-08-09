public class IsSortedRec {
    public static boolean isArraySorted(int arr[], int idx) {

        if (idx == arr.length-1) {
            return true;
        }

        if (!isArraySorted(arr, idx+1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        if (isArraySorted(arr, 0)) {
            System.out.println("Increasing");   
        } else {
            System.out.println("not Increasing");
        }
    }
}