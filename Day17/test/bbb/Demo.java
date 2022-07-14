package test.bbb;

public class Demo {
    public static void main(String[] args) {
        Student<String> stu1 = new Student<>();
        stu1.setName("张三");
        stu1.setAge("18");
        System.out.println("stu1 = " + stu1);

        Student<Integer> stu2 = new Student<>();
        stu2.setName("李四");
        stu2.setAge(20);
        System.out.println("stu2 = " + stu2);

        Student<Object> stu3 = new Student<>();
        stu3.setName("王五");
        stu3.setAge("20");
        System.out.println("stu3 = " + stu3);
    }
}
