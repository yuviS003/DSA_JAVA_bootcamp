package com.Yuvraj;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

//        TYPE CASTING
//        int num = (int) (67.52f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); // 257%256 = 1
//        System.out.println(b);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1324;
        double result = (f*b) + (i/c) - (d-s);
        System.out.println((f*b) + " "+(i/c)+" "+(d-s));
        System.out.println(result);
    }
}
