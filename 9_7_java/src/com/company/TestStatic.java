package com.company;

public class TestStatic {
    public static class S{
        private static int a;
        private int t = 0;
        //静态构造器 一般情况下不静态 因为静态了就没法直接调用了
        static {
            a=10;
        }

        //静态方法只能访问静态数据 因为静态方法的生成在内存中早于实例
        public static int getA(){
            return a;
        }

        //非静态方法则无这个限制
        public int getT(){
            return t;
        }

        public int get(){
            getT();
            getA();
            t = a;
            return t;
        }
    }

    public static void main(String[] args) {
        S s = new S();
        System.out.println(S.getA()); // 方法1.使用类名来调用静态方法
        System.out.println(s.getA());//方法2.使用实例来调用静态方法 这样有警告 因为实例有可能会消失
    }
}
