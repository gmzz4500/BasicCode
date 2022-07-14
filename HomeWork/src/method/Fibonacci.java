package method;

/*
 * 键盘输入一个n,求出第n位斐波那契数列的值
 * */
public class Fibonacci {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int i = 5;
//        while (i > 0) {
//            i--;
//        }
        for (int i = 1; i <= 5; i++) {
//            System.out.println("请输入一个整数:");
//            int n = sc.nextInt();
            int fibonacci = getFibonacci(i);
            System.out.print("fibonacci = " + fibonacci + "\t");

        }

    }

    public static int getFibonacci(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                num = getFibonacci(n - 2) + getFibonacci(n - 1);
            }
        }
        return num;
    }
}
