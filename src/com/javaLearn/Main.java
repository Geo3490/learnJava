package com.javaLearn;

import java.text.NumberFormat;

public class Main {
    //CONVERT STRING VALUE TO NUMBER VALUE USING Integer.parseInt

//    public static void main(String[] args) {

//        String x = "1";
//
//        int y = Integer.parseInt(x) + 2;
//
//        System.out.println(y);
//    }

    //public static void main(String[] args) {

    //Math.random is by itself .000-1 this is why you multiply by 100 to get 0-100 result//
//                int result = (int)(Math.random() * 100);
//
//        System.out.println(result);
    //}

    //NUMBER FORMATTING

    // CONVERTING NUMBERS INTO STRING Currency $1.00 numbers//
    public static void main(String[] args) {

        NumberFormat money = NumberFormat.getCurrencyInstance();
        String result = money.format(121324);

        System.out.println(result);
    }
}



