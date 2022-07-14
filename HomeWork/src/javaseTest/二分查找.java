package javaseTest;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        System.out.println(二分查找.binarySearch(arr, 9));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid = 0;
        int index = -1;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (target == arr[i]) {
                    index = i;
                } else if (target < arr[i]) {
                    end = i - 1;
                } else {
                    start = i + 1;
                }
            }
            break;
        }
        if (index == -1) {
            System.out.println("你查找的数不存在~");
            return index;
        } else {
            System.out.print(target + "的索引为:");
            return index;
        }

    }
}

