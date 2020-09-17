package com.company;

import java.util.Random;

public class RandomDemo {
    int[] Answer = new int[4];

    public RandomDemo() {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            Answer[i] = random.nextInt(10);
        }
    }

    public void MakeFortune() {
        Random random = new Random();
        int fortune = random.nextInt(101);
        if (fortune <= 5)
            System.out.println("大吉");
        else if (5 < fortune && fortune <= 10)
            System.out.println("中吉");
        else if (10 < fortune && fortune <= 15)
            System.out.println("小吉");
        else if (15 < fortune && fortune <= 30)
            System.out.println("吉");
        else if (30 < fortune && fortune <= 50)
            System.out.println("末吉");
    }

    public void GuessNum(int num) {
        int sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (Answer[i] == num % 10)
                sum++;
            num = num / 10;
        }
        System.out.println("本次猜对了" + sum + "个");
    }
}
