package method;

public class HomeWork02 {
    public static void main(String[] args) {
        String[] s = {"我","爱","java"};
        System.out.println(new A02().findString(s, "jav"));

    }
}
class A02{
    public int findString(String[] str,String s){
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            if(s.equals(str[i])){
                index = i;
            }
        }
        if(index!=-1){
            return index;
        }else{
            System.out.println("不好意思,你查找的字符串不存在~");
            return index;
        }
    }
}
