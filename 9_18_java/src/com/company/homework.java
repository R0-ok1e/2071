package com.company;

import org.w3c.dom.ls.LSException;

import java.util.*;
import java.util.stream.Stream;

public class homework {

    //1.返回集合最大最小的元素,并打印排序后的结果
    public List<? extends Collection> MinAndMax(Collection s) {
        List result = new ArrayList();
        result.add(Collections.max(s));
        result.add(Collections.min(s));
        Stream stream = s.stream();
        stream.sorted().forEach(System.out::println);
        return result;
    }

    //2.生成10个1至100的随机数(不能重复),存入一个list集合,再排序并输出
    public List GetRandom(){
        Random random = new Random();
        List numbers = new ArrayList();
        for (int i=0;i<10;i++){
            int s = random.nextInt(100);
            if(!numbers.contains(s)){
                numbers.add(s);
            }else {
                i--;
            }
        }
        return numbers;
    }

    public List MySort(List list){
        List newlist = list;
        Collections.sort(newlist);
        for (Iterator it=newlist.iterator();it.hasNext();){
            System.out.println(it.next());
        }
        return newlist;
    }

    //3.编写一个book类,实现按照price排序
    //见StreamDemo

    //4.去掉集合中的重复元素
    public void ClearRepetition(List old){
        HashSet h = new HashSet(old);
        old.clear();
        old.addAll(h);
    }

    //5.生成验证码

    public String CreateCode(){
        Random random = new Random();
        char[] code = new char[4];
        for(int i=0;i<4;i++){
            int temp = random.nextInt(75)+48;
            if((temp>=48&&temp<=57)||(temp>=65&&temp<=122))
                code[i] = (char)temp;
            else
                i--;
        }
        return code.toString();
    }

    //6.创建一个 HashMap对象，用于存储银行储户的信息(其中储户的主要信息有储户的ID，姓名和余额)。另外，计算并显示其中某个储户的当前余额
    class Bank{
        private HashMap<Integer,User> UserList;
        private int num;
        Bank(){

        }

        public void ShowMember(){
            for (Iterator it = UserList.values().iterator(); it.hasNext();){
                System.out.println(it.next());
            }
        }

        public void put(User user){
            if (UserList.containsValue(user))
                System.out.println("已存在该用户");
            else
                UserList.put(user.id,user);
        }


    }

    class User{
        private int id;
        private int balance;
        private String name;

        public User(int id, int balance, String name) {
            this.id = id;
            this.balance = balance;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }



    //7.输入任意字符串,返回每个单词出现的次数
    public HashMap<Character, Integer> WordNumber(String s){
        char[] sentence = s.toCharArray();
        HashMap<Character,Integer> words = new HashMap<>();
        for(char w:sentence){
            if(words.containsValue(w))
                words.put(w,words.get(w)+1);
            else
                words.put(w,1);
        }
        return words;
    }
}

class Book{
    public String name;
    public int num;
    public String author;
    private int price;

    public Book(String name, int num, String author, int price) {
        this.name = name;
        this.num = num;
        this.author = author;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}