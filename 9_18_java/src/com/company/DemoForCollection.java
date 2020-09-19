package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DemoForCollection {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("Java");
        objects.add("C++");
        objects.add("C");
        objects.add("JS");
        objects.add("Python");
        Set<String> set2 = new HashSet<>(objects);




        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("C");
        set.add("C++");
        set.add("JS");
        System.out.println(set);


    }
}
