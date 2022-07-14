package operator;

public class HomeWork05 {
    public static void main(String[] args) {
        //初始化100000元
        int cash = 100000;
        int count = 1;
        while (cash >= 0) {
            if (cash > 50000) {
                cash *= 0.95;
                count++;
            } else {
                cash -= 1000;
                count++;
            }
        }
        System.out.println("该人最多可经过路口次数为:" + count);
    }
}
