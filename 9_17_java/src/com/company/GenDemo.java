package com.company;

public class GenDemo<K,V> {
    private K k;
    private V v;

    public GenDemo(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public GenDemo() {

    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}
class Student<K,V> extends GenDemo<K,V>{

    public Student(K k, V v) {
        super(k, v);
    }

    public Student() {
        super();
    }
}

class Test2{
    public static void main(String[] args) {
        GenDemo<String,String > genDemo = new Student<String, String>();
        Point1<Person> point1 = new Point1();
        Person person = new Person();
        person.setName("zhang3");
        point1.setObject1(person);
        System.out.println(point1.getObject1().getName());


    }
}

class Point1<Object>{
    private Object object1;

    public Object getObject1() {
        return object1;
    }

    public void setObject1(Object object1) {
        this.object1 = object1;
    }

    public Point1(Object object1) {
        this.object1 = object1;
    }

    public Point1() {

    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class GeneratorImpl<T> implements Generator<T>{

    @Override
    public T next() {
        return null;
    }
}

interface Generator<T> {
    T next();
}