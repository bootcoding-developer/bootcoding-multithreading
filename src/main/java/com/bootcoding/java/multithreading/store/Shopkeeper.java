package com.bootcoding.java.multithreading.store;

import com.bootcoding.java.multithreading.store.bag.BagService;
import com.bootcoding.java.multithreading.store.book.BookService;
import com.bootcoding.java.multithreading.store.bottle.BottleService;

public class Shopkeeper {

    public static void main(String[] args) {
        // Using Runnable

        Thread t1 = new Thread(new BookService(1000));
        Thread t2 = new Thread(new BottleService(1000));
        Thread t3 = new Thread(new BagService(1000));
        t1.start();
        t2.start();
        t3.start();

    }
}
