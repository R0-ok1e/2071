package com.company;

/*
* 1.成员内部类
* 2.局部内部类
*
*
*  成员内部类:
*   内有外 随意用 外用内 需新建
*   直接使用: 外.内 对象名 = new 外部类名称().new 内部类名称()
*   间接使用: 在外部类的方法中创建内部类
*   因此成员内部类里不能有静态的方法
*
*
* 局部内部类:
* 只有在当前所属的方法才能使用它
*
* 匿名内部类:
* 接口名称 对象名 = new 接口名称(){覆盖重写接口中的所以抽象方法};
* */

public class InnerClassDemo {
    public static void main(String[] args) {
        Body body = new Body();
        body.MethodBody();

        Body.Heart heart = new Body().new Heart();

        Outer outer = new Outer();
        outer.methodOuter();
        //匿名内部类 省去了实现类
        MyInterface obj = new MyInterface(){

            @Override
            //这个类实际上没有自己的名字 MyInterface是接口的名称
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();
    }
}

//成员内部类
class Body{
    public class Heart{
        private String name;

        public void beat(){
            System.out.println("心脏跳动");
            System.out.println(Body.name);
        }
    }

    private static String name;

    public void MethodBody(){
        System.out.println("外部类的方法");
        new Heart().beat(); // 匿名对象
    }
}

//局部内部类
class Outer{

    int num = 20;

    public void methodOuter(){
        int num = 30;//这个num不能改 因为局部变量跟着方法走 在栈内存里 但new的对象在堆内存里 所以Inner的生命可能长于num
        //num = 20; 会报错
        class Inner{
            public void showInner(){
                System.out.println("这里是内部类");
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.showInner();
    }
}

//匿名内部类 如果父类的子类 或者 接口的实现类 只需要使用一次 则可以使用匿名内部类
interface MyInterface{
    public abstract void method();
}

