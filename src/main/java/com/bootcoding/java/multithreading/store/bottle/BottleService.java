package com.bootcoding.java.multithreading.store.bottle;

import com.bootcoding.java.multithreading.store.book.Book;
import com.bootcoding.java.multithreading.utils.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BottleService implements Runnable{

    private List<Bottle> bottles = new ArrayList<>();
    int quantity;
    public BottleService(int q){
        this.quantity = q;
    }
    public void createBottle(int quantity) throws InterruptedException{
        for(int i = 0; i < quantity; i++){
            bottles.add(new Bottle(IDGenerator.id(), BottleBrandGenerator.getName(),
                    ColorGenerator.getName(), PriceGenerator.getPrice()));
            System.out.println(Thread.currentThread().getName() +"| Bottle  " +bottleCount());
            Thread.sleep(100);
        }

    }

    public int bottleCount(){
        return bottles.size();
    }

    public Bottle getBottleInStock(){
        return bottles.get(new Random().nextInt(bottles.size()));
    }

    private Random random = new Random();

    @Override
    public void run() {
        try {
            createBottle(quantity);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
