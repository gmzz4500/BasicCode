package com.yyds.homework.homework2;

import java.io.IOException;
import java.util.Properties;

public class FruitDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Properties pro = new Properties();
        pro.load(ClassLoader.getSystemClassLoader().getResourceAsStream("fruit.properties"));
        Class<?> clazz = Class.forName(pro.getProperty("fruitName"));
        System.out.println(clazz.getName());
        Fruit fruit = (Fruit)clazz.newInstance();
        Juicer juicer = new Juicer();
        juicer.run(fruit);
    }
}
