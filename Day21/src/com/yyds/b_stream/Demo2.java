package com.yyds.b_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*
     #### Stream流综合练习【应用】

- 案例需求

  现在有两个ArrayList集合，分别存储6名男演员名称和6名女演员名称，要求完成如下的操作

  - 男演员只要名字为3个字的前三人
  - 女演员只要姓林的，并且不要第一个
  - 把过滤后的男演员姓名和女演员姓名合并到一起
  - 把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据

  演员类Actor已经提供，里面有一个成员变量，一个带参构造方法，以及成员变量对应的get/set方法

  Stream流完成
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> womanList = new ArrayList<>();
        Collections.addAll(womanList, "林心如", "张曼玉", "林青霞", "柳岩", "林志玲", "王祖贤");
        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList, "周润发", "成龙", "刘德华", "吴京", "周星驰", "李连杰");
        //男演员只要名字为3个字的前三人
        Stream<String> manStream = manList.stream();
        Stream<String> manStream1 = manStream.filter(name->name.length() == 3);
        Stream<String> manStream2 = manStream1.limit(3);
        //女演员只要姓林的，并且不要第一个
        Stream<String> womanStream = womanList.stream();
        Stream<String> womanStream1 = womanStream.filter(name -> name.startsWith("林"));
        Stream<String> womanStream2 = womanStream1.skip(1);
        //把过滤后的男演员姓名和女演员姓名合并到一起
        Stream<String> concatStream = Stream.concat(manStream2, womanStream2);
        //把上一步操作后的元素作为构造方法的参数创建演员对象,遍历数据
        Stream<Actor> actorStream = concatStream.map(Actor::new);
        actorStream.forEach(new Consumer<Actor>() {
            @Override
            public void accept(Actor actor) {
                System.out.println("actor = " + actor);
            }
        });
    }
}
