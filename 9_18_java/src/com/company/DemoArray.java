package com.company;

public class DemoArray {
    private int index = 0;
    private Integer[] elements = new Integer[100];

    public int Search(int index){
        return elements[index];
    }

    public void Add(int element){
        elements[index] = element;
        index++;
    }

}
