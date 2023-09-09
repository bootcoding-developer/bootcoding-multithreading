package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.mythread.AlphabetThread;
import com.bootcoding.java.multithreading.mythread.NumberThread;
import com.bootcoding.java.multithreading.mythread.SpecialSymbolThread;

public class ThreadEx2 {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());

        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new AlphabetThread();
        t2.start();
        Thread t3 = new SpecialSymbolThread();
        t3.start();
    }
}
