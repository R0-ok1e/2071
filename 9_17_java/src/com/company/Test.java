package com.company;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();

        point.setK("zhang3");
        point.setT(120);

        Object t = point.getT();



    }
}

class Point<K,T> { //占位符
    private K k;
    private T t;

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    /*
    private String north;
    private String south;

    Point(String north,String south){
        this.north = north;
        this.south = south;
    }
    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }
    public String getSouth() {
        return south;
    }

    public void setSouth(String south) {
        this.south = south;
    }
}*/


}
