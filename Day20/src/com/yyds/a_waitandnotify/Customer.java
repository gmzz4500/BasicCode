package com.yyds.a_waitandnotify;

import java.io.Serializable;
import java.util.Objects;

public class Customer extends Thread implements Serializable {
    private static final long serialVersionUID = 7031974394732026868L;
    private BaoZi bz;

    public Customer() {
    }

    public Customer(String name, BaoZi bz) {
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
        Customer customer = (Customer) o;
        return Objects.equals(bz, customer.bz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bz);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bz=" + bz +
                '}';
    }

    //编写线程对象的任务
    @Override
    public void run() {
        //顾客一直吃包子
        while (true) {
            //保证线程安全
            synchronized (bz) {
                //没有包子的时候,顾客只能无限等待
                if (!bz.isFlag()) {
                    try {
                        bz.wait();//释放锁资源和CPU执行权
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果能到这里,说明有包子可以吃
                System.out.println("顾客" + getName() + "正在吃" + bz.getXianer() + "的包子~");
                try {
                    Thread.sleep(2000);//持有锁资源,释放CPU执行权
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("包子太好吃了,再来一份~");
                //真正吃包子
                bz.setFlag(false);
                //包子没有了,唤醒厨师
                bz.notify();
            }
        }
    }
}
