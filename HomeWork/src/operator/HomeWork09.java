package operator;

/*
 * 输出1-100之间的不能被5整除的数,5个一行
 * */
public class HomeWork09 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + "\t");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
