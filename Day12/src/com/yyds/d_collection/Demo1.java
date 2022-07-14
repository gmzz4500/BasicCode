package com.yyds.d_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        Collection<String> objs = new ArrayList<>();
        objs.add("我");
        objs.add("爱");
        objs.add("中");
        objs.add("国");
        System.out.println(objs);
        Iterator<String> it = objs.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
