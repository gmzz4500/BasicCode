package com.yyds.homework.homework1;

import org.junit.Test;

import java.lang.reflect.*;

public class Demo {
    @Test
    public void test01() throws ClassNotFoundException {
        //获取Class对象
        String className = "com.yyds.homework.homework1.AtguiguStudent";
        Class<?> clazz = Class.forName(className);
        System.out.println("clazz = " + clazz);
        //获取类加载器对象
        ClassLoader classLoader = Class.forName(className).getClassLoader();
        System.out.println("classLoader = " + classLoader);
        //获取包名
        String packageName = clazz.getPackage().getName();
        System.out.println("packageName = " + packageName);
        //类名
        String name = clazz.getName();
        System.out.println("name = " + name);
        //获取父类
        String superName = clazz.getSuperclass().getName();
        System.out.println("superName = " + superName);
        //父接口
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        //属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            //修饰符,数据类型,属性名
            int modifiers = field.getModifiers();
            System.out.println("属性的修饰符:" + Modifier.toString(modifiers));
            String name1 = field.getName();
            System.out.println("属性名:" + name1);
            Class<?> type = field.getType();
            System.out.println("属性数据类型:" + type);
        }
        //构造器们
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            System.out.println("第" + (i + 1) + "个构造器:");
            //修饰符,构造器名称,构造器形参列表,抛出异常列表
            int modifiers = constructor.getModifiers();
            System.out.println("构造器的修饰符：" + Modifier.toString(modifiers));

            String name2 = constructor.getName();
            System.out.println("构造器名：" + name2);

            //形参列表
            Class[] parameterTypes = constructor.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println("形参:" + parameterType);
            }

            //异常列表
            Class<?>[] exceptionTypes = constructor.getExceptionTypes();
            for (Class<?> exceptionType : exceptionTypes) {
                System.out.println("异常:" + exceptionType);
            }
            System.out.println();
        }
        //方法们
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method method = declaredMethods[i];
            System.out.println("第" + (i + 1) + "个方法：");
            //修饰符、返回值类型、方法名、形参列表 、异常列表
            int modifiers = method.getModifiers();
            System.out.println("方法的修饰符：" + Modifier.toString(modifiers));

            Class<?> returnType = method.getReturnType();
            System.out.println("返回值类型:" + returnType);

            String name2 = method.getName();
            System.out.println("方法名：" + name2);

            //形参列表
            System.out.println("形参列表：");
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType);
            }

            //异常列表
            System.out.println("异常列表：");
            Class<?>[] exceptionTypes = method.getExceptionTypes();
            for (Class<?> exceptionType : exceptionTypes) {
                System.out.println(exceptionType);
            }
            System.out.println();
        }
    }

    @Test
    public void test02() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        //创建Class对象
        String className = "com.yyds.homework.homework1.AtguiguStudent";
        Class<?> clazz = Class.forName(className);
        //根据Class使用反射创建对象
        Object as = clazz.newInstance();
        //获取属性school
        Field school = clazz.getDeclaredField("school");
        school.setAccessible(true);
        school.set(as,"尚硅谷");
        System.out.println("school的值:" + school.get(as));
    }

    @Test
    public void test03() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //创建Class对象
        String className = "com.yyds.homework.homework1.AtguiguStudent";
        Class<?> clazz = Class.forName(className);
        //根据Class使用反射创建对象
        Object as = clazz.newInstance();
        //获取属性className
        Field cn = clazz.getDeclaredField("className");
        //设置className属性的值
        cn.setAccessible(true);
        cn.set(as,"Java20220317班");
        System.out.println(cn.getName() + "的修饰符:" + Modifier.toString(cn.getModifiers())
                + "\n数据类型:" + cn.getType() + "\n值为:" + cn.get(as));
    }
    @Test
    public void test04() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //创建Class对象
        String className = "com.yyds.homework.homework1.AtguiguStudent";
        Class<?> clazz = Class.forName(className);
        //获取有参构造
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class);
        //创建对象
        Object as1 = constructor.newInstance("Java20220317班");
        Object as2 = constructor.newInstance("Java20220417班");
        //获取compareTo方法
        Method compareTo = clazz.getDeclaredMethod("compareTo", AtguiguStudent.class);
        System.out.println("as1和as2的比较结果:" + compareTo.invoke(as1, as2));
    }
}
