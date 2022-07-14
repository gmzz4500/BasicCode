package method;

import java.util.Arrays;

public class HomeWork04 {
    public static void main(String[] args) {
        A03 a03 = new A03();
        int[] arr = {1,2,3,4,5};
        a03.copyArr(arr);
    }
}
class A03{
    public void copyArr(int[] arr){
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i]=arr[i];
        }
        System.out.println(Arrays.toString(arrNew));
    }
}