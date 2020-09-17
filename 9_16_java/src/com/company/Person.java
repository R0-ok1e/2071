package com.company;

enum Gender{
    FEMALE("女"),MALE("男"),UNKOWN("未知"),DOUBLE("人妖");

    private String genderDesc;

    Gender(String genderDesc) {
        this.genderDesc = genderDesc;
    }

    @Override
    public String toString() {
        return genderDesc;
    }
}

public class Person {
    private String username;
    private String password;
    private Double price;
    private Gender sex;
    Person(String username,String password,Double price,Gender sex){
        this.username = username;
        this.password = password;
        this.price = price;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Double getPrice() {
        return price;
    }

    public Gender getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", price=" + price +
                ", sex=" + sex +
                '}';
    }
}

class TestPerson{

}