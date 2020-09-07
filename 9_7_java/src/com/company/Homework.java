package com.company;

public class Homework {
    static String n1 = examName("0");
    {
        n1 = examName("A");
    }
    static {
        n1 = examName("C");
    }

    public static void main(String[] args) {
        Homework s1 = new Homework();
    }

    public static String examName(String s){
        System.out.println(s);
        return s;
    }
}
