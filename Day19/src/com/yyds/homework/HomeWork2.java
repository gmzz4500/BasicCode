package com.yyds.homework;

public class HomeWork2 {
    public static void main(String[] args) {
        new PrintEven().start();
        new PrintOdd().start();
    }
}

class PrintEven extends Thread {
    Object o = new Object();
    int num = 2;

    @Override
    public void run() {
        synchronized (o) {
            while (true) {

                for (int i = 1; i <= 100; i++) {
                    for (int j = 0; j < 5; j++) {
                        num += 2;
                        System.out.println(getName() + ":" + i);
                    }
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    o.notify();
                }
            }
        }
    }
}

class PrintOdd extends Thread {
    Object o = new Object();
    int num = 1;

    @Override
    public void run() {
        synchronized (o) {
            while (true) {

                for (int i = 1; i <= 100; i++) {
                    for (int j = 0; j < 5; j++) {
                        num += 2;
                        System.out.println(getName() + ":" + i);
                    }
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    o.notify();
                }
            }
        }
    }
}