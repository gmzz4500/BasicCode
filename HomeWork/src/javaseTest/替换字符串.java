package javaseTest;


public class 替换字符串 {
    public static void main(String[] args) {
        System.out.println(replace1("aaddbbdcddee", "dd", "11"));
    }

    private static String replace1(String text, String target, String replace) {
        StringBuilder sb = new StringBuilder();
        if (text.indexOf(target) == -1) {
            return "文本中无此目标字符串";
        }
        while (text.indexOf(target) != -1) {
            int index = text.indexOf(target);
            sb.append(text.substring(0, index)).append(replace);
            text = text.substring(index + target.length());
            if(text.indexOf(target)==-1){
                sb.append(text);
            }
        }
        return sb.toString();
    }
    public static String replace(String text ,String target, String replace){
        String[] split = text.split(target);
        String str = "";
        for (int i = 0; i < split.length; i++) {
            str+=(split[i]+replace);
        }
        return str;
    }
    public static String replace2(String text, String target, String replace) {
        int len = target.length();      //获取target的长度
        StringBuffer sb = new StringBuffer();
        String end = text;
        if(!end.contains(target)){
            return "文本中无目标字符串";
        }
        while (end.contains(target)) {
            int index = end.indexOf(target);   //获取第一次target的下标
            String first = end.substring(0, index);     //获取下标为0,index的字符
            end = end.substring(index + len);      //获取替换字符后的字符串
            sb = sb.append(first).append(replace);  //用一个新的变量来拼接
            if (!end.contains(target)) {
                sb = sb.append(end);
            }
        }
        return sb.toString();
    }
}
