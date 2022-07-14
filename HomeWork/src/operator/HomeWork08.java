package operator;

/*
 * 统计水仙花数的个数
 * */
public class HomeWork08 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (i == a * a * a + b * b * b + c * c * c) {
                System.out.println(i + "是一个水仙花数~");
                count++;
            }
        }
        System.out.println("水仙花个数为:" + count);
    }
}
