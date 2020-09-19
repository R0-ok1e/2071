package com.company;

public class ObjectPair<Object1,Object2>{
    private final Object1 first;
    private final Object2 second;

    public ObjectPair(Object1 first, Object2 second) {
        this.first = first;
        this.second = second;
    }

    public Object1 getFirst() {
        return first;
    }

    public Object2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}