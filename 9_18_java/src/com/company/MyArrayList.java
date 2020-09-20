package com.company;

import java.util.Iterator;

public class MyArrayList<Item> implements Iterable<Item>{
    private int index = 0;
    private int capacity = 10;
    private Item[] elements = (Item[]) new Object[capacity];
    public MyArrayList(){

    }

    public int getCapacity(){
        return capacity;
    }

    public void add(Item item){
        if(index >= capacity-1)
            System.out.println("已经达到上限");
        elements[index+1] = item;
        index++;
    }

    public void AddAllElements(Item[] NewOne){
        int i = 0;
        int j = index;
        while (i< NewOne.length && j < capacity){
            elements[++i] = NewOne[++j];
        }
    }

    public boolean contain(Item item){
        for(Item match:elements){
            if(match.equals(item))
                return true;
        }
        return false;
    }

    public boolean isEmpty(){
        return index==0;
    }




    @Override
    public Iterator<Item> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<Item>{
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current<capacity;
        }

        @Override
        public Item next() {
            Item newone = elements[current++];
            return newone;
        }

    }
}
