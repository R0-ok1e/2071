package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        Person zhangsan = new Person("张三", 18);
        Product shouji = new Product("shouji",1000);
        System.out.println(shouji.getScancode());
        Product diannao = new Product("diannao",5000);
        System.out.println(diannao.getScancode());

    }
}
