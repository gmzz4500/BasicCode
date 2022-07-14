package javaseTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
    统计字符在字符串中出现的次数
 */
public class 统计字符个数2 {
    public static void main(String[] args) {
        //键盘录入一句话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句话:");
        String line = sc.nextLine();
        //创建一个集合,利用键值对存储 字符及对应次数
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        //遍历集合,输出每个存在的字符及对应次数
        Set<Character> keys = hm.keySet();
        for (Character key : keys) {
            //根据键值获取value
            Integer count = hm.get(key);
            System.out.println("字符:" +  key +" 出现次数: " + count);
        }

    }
}
