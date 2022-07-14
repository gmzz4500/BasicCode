package method;

public class HomeWork01 {
    public static void main(String[] args) {
        A01 a = new A01();
        double[] arr = {1.1,1.2,1.3,1.4,1.5};
        double max1 = a.getMax(arr);
        System.out.println(max1);
    }
}
class A01{
    public double getMax(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
