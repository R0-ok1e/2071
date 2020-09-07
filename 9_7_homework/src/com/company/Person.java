package com.company;

public class Person {

    private String name;
    private int age;
    static int sum = 0;
    public static int GetSum(){
        return sum;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        sum++;
    }

    public Person(String name) {
        this.name = name;
        sum++;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}