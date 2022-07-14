package operator;
/*
* 1-100 以内的数求和，求出 当和 第一次大于 20 的当前数
* */
public class HomeWork03 {
    public static void main(String[] args) {
        //定义一个变量存储和
        int sum = 0;
        //循环求和
        for (int i = 1; i < 100; i++) {
            sum += i;
            if(sum>20){
                System.out.println("和第一次大于20为:" + sum + ",此时该数为:" + i);
                break;
            }
        }

    }
}
