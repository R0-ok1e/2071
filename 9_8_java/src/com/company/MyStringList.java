package com.company;

import java.util.Arrays;

public class MyStringList {
    String[] stringlist = new String[100];
    int index = 0;

    //增
    void addStr(String str){
        stringlist[index] = str;
        index++;
    }

    //删
    void removeStr(String str){
        for(int i=0;i<=index; i++){
            if(stringlist[i].equals(str)){
                stringlist[i] = null;
            }
        }
        refresh();
    }

    //刷新下标
    void refresh(){
        int temp=0;
        for(int i=0;i<index;i++){
            if(stringlist[i] == null){
                stringlist[i] = stringlist[i+1];
                temp++;
            }
        }
        index = index-temp;
    }

    //获取指定下标的字符串
    String getStr(int index){
        return stringlist[index];
    }

    //在指定位置插入字符串
    void addStr(String str,int position){
        if(position < index)
            System.out.println("插入位置无效");

    }

    int MyCompareTo(String a,String b){
        char[] tempA = a.toCharArray();
        char[] tempB = b.toCharArray();
        int x=0;
        for(int i=0; i<tempA.length; i++){
            if(tempA[i] != tempB[i]){
                x = tempA[i]-tempB[i];
                break;
            }
        }
        return x;
    }



}
