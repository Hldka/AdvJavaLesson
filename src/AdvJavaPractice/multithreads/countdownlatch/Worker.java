package AdvJavaPractice.multithreads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
    @Override
    public void run() {
        System.out.println(name+"  -threadi basladi .");
        System.out.println(name+" bazi islemler yapiyor...");
        System.out.println(name+" -threadi bitti.");
        latch.countDown();
    }

    private String name;

    public Worker(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    private CountDownLatch latch;
}
