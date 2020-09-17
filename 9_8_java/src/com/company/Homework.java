package com.company;

import java.util.Random;

public class Homework {
    public class NewChar{
        char[] load = new char[100];
        int len = 0;

        //接收一个字符串
        public void AppendChar(String string){
            char[] cache = string.toCharArray();
            for(int i=0;i<cache.length;i++){
                load[len] = cache[i];
                len++;
            }
        }

        //接收一个字符
        public void AppendChar(char one){
            load[len] = one;
            len++;
        }

        //返回存储的字符串
        public String StringBuffer(){
            String Newstr = new String(load);
            return Newstr;
        }

        //翻转字符串
        public String split(String string){
            char[] temps = string.toCharArray();
            for(int i=0; i< temps.length/2; i++){
                char temp;
                temp = temps[i];
                temps[i] = temps[temps.length-1];
                temps[temps.length-1] = temp;
            }
            String NewString = new String(temps);
            return NewString;
        }
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        int out = random.nextInt(12);
        System.out.println(out);
    }
}
