package javaseTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
    统计字符在字符串中出现的次数
 */
public class 统计字符个数 {
    public static void main(String[] args) {
        //键盘录入一句话
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一句话:");
        String line = sc.nextLine();
        //转成字符数组
        char[] chars = line.toCharArray();
        //创建一个集合,利用键值对存储 字符及对应次数
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            //如果该字符第一次出现
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
                //该字符已经在集合中出现过
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        //遍历集合,输出每个存在的字符及对应次数
        Set<Map.Entry<Character, Integer>> entries = hm.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            //取出字符
            Character ch = entry.getKey();
            //取出出现次数
            Integer count = entry.getValue();
            System.out.println("字符: " + ch + "\n出现次数: " + count);
        }
    }
}
