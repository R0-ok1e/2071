package com.company;

public class Product {
    private String name;
    private double price;
    private int num;
    private int scancode;
    private static int sum = 0;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
        scancode = 1000 + sum;
        sum++;
    }

    public String getName(){
        return name;
    }

    public int getScancode(){
        return scancode;
    }

    public double getPrice(){
        return price;
    }

    public void ChangePrice(double NewPrice){
        price = NewPrice;
    }

    public int getNum(){
        return num;
    }

    public int getSum(){
        return sum;
    }

    public void getInfo(){
        System.out.println("---产品信息---");
        System.out.println("名称:"+name);
        System.out.println("编码:"+scancode);
        System.out.println("价格:"+price);
    }


}
