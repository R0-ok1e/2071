package com.company;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread{
    private Lock lock = new ReentrantLock();
    public void LockTest(Thread thread){
        lock.lock();
        try {
            System.out.println(thread.getName()+"进来了");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(thread.getName()+"发生了异常,释放了锁");
        }finally {
            lock.lock();
            System.out.println(thread.getName()+"正常执行完毕,释放了锁");
        }
    }

    public void LockTestNotWait(Thread thread) throws InterruptedException{
        if (lock.tryLock(3000,TimeUnit.MILLISECONDS)){
            try{
                System.out.println(thread.getName()+"获取了当前锁");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(thread.getName()+"发生了异常");
            }finally {
                System.out.println("正常执行完毕,释放了锁");
            }
        }else {
            System.out.println(thread.getName()+"没有获取到锁,被其他线程占用了");
        }
    }
}
class TestMyThread{
    public static void main(String[] args) {
        final MyThread myThread = new MyThread();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    myThread.LockTestNotWait(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"线程A");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    myThread.LockTestNotWait(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"线程B");
        t1.start();
        t2.start();
    }
}