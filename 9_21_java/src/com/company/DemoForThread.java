package com.company;
/*
*一个运行的虚拟机对应一个java进程,而线程位于同一个虚拟机中
* 每个程序至少有一个主线程,它是调用main程序方法的那个线程
*
* 有两种创建线程的方法:
* 1.创建thread的子类并重写run方法
* 2.实现接口runnable,并将实现的对象传递给Thread构造函数
*
*
* 应该使用start而不是run
* run是让调用run()方法的线程执行
*
*/
public class DemoForThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i=0;i<10;i++){
            new Thread("线程"+i){
                @Override
                public void run() {
                    System.out.println(getName()+"is running");
                }
            }.start();
        }
    }
}

