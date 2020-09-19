package com.company;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class SettleDemo {
    public static void main(String[] args) {
        Collection<Integer> con = new ArrayList();
        con.add(111);
        con.add(123);
        con.add(456);
        con.addAll()


        //迭代器
        Consumer<Integer> consumer = (integer)->{
            System.out.println(integer);
        };
        //consumer.accept(12);
        con.forEach(consumer);

        Collection<Student> students = new ArrayList<>();
        students.add(new Student("zhang3",1));
        students.add(new Student("li4",2));
        students.add(new Student("wang5",3));
        students.add(new Student("zhao6",4));


    }
}
class Student{
    private String name;
    private int number;

    public Student() {
    }

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}