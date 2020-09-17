package com.company;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoForException {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(date);


    }

    public static Exception checkNum(String number) throws Exception {
        if (number.equals("+") || number.equals("-") || number.equals("*") || number.equals("/")) {
            throw new Exception("输入非法字符");
        }

        char[] chars = number.toCharArray();
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(chars[i])) {

            } else {
                throw new Exception("有非法字符");
            }
        }
        throw null;
    }
}
