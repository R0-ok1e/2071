package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Game {
    private static final int[] ARR = new int[4];
    private static Random RANDOM = new Random();
    private static int count = 0;
    private static int position = 0;

    public static int getCount() {
        return count;
    }

    public static int getPosition() {
        return position;
    }

    public int[] getArr() {
        return ARR;
    }

    public static void checkNum(String str){
        char[] chars = str.toCharArray();
        for(int i=0; i<chars.length; i++){
            for(int j=0; j< ARR.length;j++){
                if(chars[i] - '0' ==ARR[j]){
                    if(i == j)
                        position++;
                }
                count++;
            }
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            int num = RANDOM.nextInt(10);
            if (!ARR.toString().contains(String.valueOf(num))) {
                ARR[i] = num;
            } else {
                i--;
            }
        }
    }
}

public class Homework4 {
    public static void main(String[] args) {
        Game game = new Game();
        int[] arr = game.getArr();
        System.out.println(Arrays.toString(arr));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字");
        String numberstring = input.next();
        Game.checkNum(numberstring);
        System.out.println(Game.getCount()+"个正确的数字"+Game.getPosition()+"个正确的位置");

    }
}
