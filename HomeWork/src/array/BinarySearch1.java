package array;

public class BinarySearch1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
        System.out.println("binarySearch(arr,9) = " + binarySearch(arr, 1));
        System.out.println("binarySearch(arr,11) = " + binarySearch(arr, 11));

    }

    public static int binarySearch(int[] arr ,int num){
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end){
            mid = (start + end) / 2;
            if (num < arr[mid]){
                end = mid - 1;
            }else if (num > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        System.out.println("你查找的数不存在~");
        return -1;
    }
}
