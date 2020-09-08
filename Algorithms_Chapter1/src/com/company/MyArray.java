package com.company;

public class MyArray {
    //数组的典型静态方法的实现
    public static int abs(int x){
        if(x>0)
            return x;
        else
            return -x;
    }

    public static boolean isPrime(int x){
        if( x < 2)
            return false;
        for(int i=2; i*i<x; i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {

    }
}
