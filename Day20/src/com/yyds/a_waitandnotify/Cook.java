package com.yyds.a_waitandnotify;

import java.io.Serializable;
import java.util.Objects;

public class Cook extends Thread implements Serializable {
    private static final long serialVersionUID = -1587745852250905195L;
    private BaoZi bz;

    public Cook() {

    }

    public Cook(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    public BaoZi getBz() {
        return bz;
    }

    public void setBz(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cook cook = (Cook) o;
        return Objects.equals(bz, cook.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bz);
    }

    @Override
    public String toString() {
        return "Cook{" +
                "bz=" + bz +
                '}';
    }

    @Override
    public void run() {
        //定义一个变量来统计包子数量,以便控制奇偶次做不同馅的包子
        int count = 0;
        //厨师一直做包子
        while (true) {
            //控制线程安全
            synchronized (bz) {
                //当包子有的时候
                if (bz.isFlag()) {
                    //进入永久睡眠
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //能到这里,说明包子没有了
                if (count % 2 == 0) {
                    bz.setXianer("猪肉大葱");
                }else{
                    bz.setXianer("韭菜鸡蛋");
                }
                System.out.println("厨师" + getName() + "做了" + bz.getXianer() + "馅的包子");
                //做包子需要时间
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子做好了,快来吃吧~");
                //真正做出包子
                bz.setFlag(true);
                //做好了包子,唤醒顾客线程
                bz.notify();
                count++;
            }
        }
    }
}
