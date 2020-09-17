package com.company;

import java.util.Random;
import java.util.Scanner;

public class LevelGuess {
    static {
        System.out.println("请选择难度等级");
        System.out.println("1.0~9");
        System.out.println("2.0~99");
        System.out.println("3.0~999");
        System.out.println("0.退出");
    }
    int answer;
    int times = 10;
    Random random = new Random();

    public boolean GuessNumber(int num){
        if(num == answer){
            System.out.println("恭喜你,猜对了");
            return true;
        } else{
            System.out.println("很遗憾,猜错了");
            times--;
            return false;
        }
    }

    //猜题记录
    public void ShowRecord(int guess){
        System.out.println(guess+"=>"+(guess-answer));
    }

    public void ShowInfo(int choose) {
        switch (choose) {
            case 1:
                System.out.println("你当前选择的难度等级:0~9");
                answer = random.nextInt(10);
                //Level1();
                break;
            case 2:
                System.out.println("你当前选择的难度等级:0~99");
                answer = random.nextInt(100);
                //Level2();
                break;
            case 3:
                System.out.println("你当前选择的难度等级:0~999");
                answer = random.nextInt(1000);
                //Level3();
            default:
                break;
        }
    }

}
