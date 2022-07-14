package com.yyds.b_object;
/*
    == : 比较基本数据类型的值是否相等,比较引用数据类型的地址值是否相等
    Object 类中的 equals 方法的源码:
        public boolean equals(Object obj){
            //调用方法的对象 == 传入方法的对象
            return (this == obj);
        }
    需求:希望用equals方法比较对象的时候不去比对象的地址值而是去比对象的属性值
    解决方案:重写父类的equals方法
 */
public class ObjectDemo1 {
    public static void main(String[] args) {
        //创建2个学生对象
        Student stu1 = new Student(null, 18);
        Student stu2 = new Student("张三", 18);
        System.out.println(stu1==stu2);//false
        System.out.println(stu1.equals(stu2));//true
    }
}
