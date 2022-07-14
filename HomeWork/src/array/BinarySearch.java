package array;

/*
    二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16};
        System.out.println("binarySearch(arr,17) = " + binarySearch(arr, 17));
    }

    public static int binarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (num == arr[middle]) {
                return middle;
            } else if (num < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}
