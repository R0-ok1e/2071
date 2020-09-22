package com.company;

public class Demo  extends   Thread{
    private static int  number=50;  //保证资源统一
    public Demo(String name) {
        super(name);
    }
    //
    @Override
    public void run() {
        //看电影 买票
        while(true){
//当某个线程执行到这一步  然后获取锁对象(MyThread.class) 其他线程只能在外面进行等待  等待先获取
            //对象锁的线程 执行完毕把锁释放    释放锁之后 该线程也加入 争夺行列
            synchronized (Demo.class) {  //this表示当前对象  四个线程对象不能保证锁的唯一性
                if (number > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Demo a = new Demo("窗口A");
        Demo b = new Demo("窗口B");
        Demo c = new Demo("窗口C");
        Demo d = new Demo("窗口D");
        a.start();
        b.start();
        c.start();
        d.start();
    }
}

class MyThread2 implements Runnable{
    private static int number = 50;

    @Override
    public void run() {
        while(true){
//当某个线程执行到这一步  然后获取锁对象(MyThread.class) 其他线程只能在外面进行等待  等待先获取
            //对象锁的线程 执行完毕把锁释放    释放锁之后 该线程也加入 争夺行列
            synchronized (this) {  //this表示当前对象  四个线程对象不能保证锁的唯一性
                if (number > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖第" + (number--) + "票");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(1000); //休眠的时候没法释放锁
            } catch (InterruptedException e) {
                e.printStackTrace();
            } // 一直到这里 锁才被释放 所有的线程再同时抢
        }
    }
}

class TestMyRunnable{
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread mT1 = new Thread(myThread2,"窗口A");
        Thread mT2 = new Thread(myThread2,"窗口B");
        Thread mT3 = new Thread(myThread2,"窗口C");
        Thread mT4 = new Thread(myThread2,"窗口D");
        mT1.start();
        mT2.start();
        mT3.start();
        mT4.start();

    }
}