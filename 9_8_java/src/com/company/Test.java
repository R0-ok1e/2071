package com.company;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LevelGuess game = new LevelGuess();
        MyStringList msl = new MyStringList();
        boolean SwitchOn = false;
      /*  Scanner input = new Scanner(System.in);
        int InputNum;
        int Hardlevel;
        Hardlevel = input.nextInt();
        game.ShowInfo(Hardlevel);
        while (!SwitchOn || game.times>=0){
            InputNum = input.nextInt();
            SwitchOn = game.GuessNumber(InputNum);
            game.ShowRecord(InputNum);
        }*/
        String a ="xyz";
        String b ="abc";
        int x = msl.MyCompareTo(a,b);
        System.out.println(x);


    }
}
