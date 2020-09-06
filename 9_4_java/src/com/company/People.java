package com.company;

public class People {
    public String name;
    private int id;
    private int level;
    public int salary;
    public int balance;
    People(String name,int id){
        this.name = name;
        level = 1;
        salary = 3000;
        balance = 0;
        this.id = id;
    }
}
