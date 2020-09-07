package com.company;

import java.time.Year;

public class Main {
    public static void Change(int n){
        for(int i = 1;i<n;i++){
            for(int j = 1; j<n; j++){
                for(int k = 1; k<n;k++){
                    if(k*1 + j*2 + i*5 == n)
                        System.out.println(k+"个1分硬币"+j+"个2分硬币"+i+"个5分硬币");
                }
            }
        }
    }
    public static String Year(long minute){
        long day = minute/1440;
        long year = day/365;
        day = day%365;
        return (year+"年"+day+"天");
    }

    public static void sort(Integer[] arr, boolean isAsc){
        for(int i = 0;i< arr.length;i++){
            boolean flag = false;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1] && isAsc == true){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                if(arr[j] <= arr[j+1] && isAsc == false){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)break;
        }
    }

    public static void sort(Integer[] arr){
        for(int i = 0;i< arr.length;i++){
            boolean flag = false;
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag)break;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Integer[] test = {1,4,2,5,3};
        sort(test,false);
        for(int i:test){
            System.out.println(i);
        }
        Integer[] test2 = {1,5,7,9,3};
        sort(test2);
        for(int i:test2){
            System.out.println(i);
        }

        System.out.println(Year(1000000));
        Change(50);
    }
}
