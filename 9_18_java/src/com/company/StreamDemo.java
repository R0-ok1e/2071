package com.company;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    /*
    * stream关注的是对数据的运算 与cpu打交道
    *集合关注的是数据的存储,与内存打交道
    *
    */
    public static void main(String[] args) {
        homework tool = new homework();

        /*List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("234");
        list.add("345");
        List list2 = tool.MinAndMax(list);
        System.out.println(list2);*/

        Book book1 = new Book("第1本书",1,"zhang3",100);
        Book book2 = new Book("第2本书",2,"li4",120);
        Book book3 = new Book("第3本书",3,"wang5",140);
        Book book4 = new Book("第4本书",4,"zhao6",160);
        Book book5 = new Book("第5本书",5,"ding1",180);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() == o2.getPrice())
                    return o1.num - o2.num;
                else
                    return o1.getPrice() - o2.getPrice();
            }
        });
        for(Iterator it = bookList.listIterator(); it.hasNext();){
            System.out.println(it.next());
        }

        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("234");
        list.add("234");
        tool.ClearRepetition(list);
        System.out.println(list);



    }
}
