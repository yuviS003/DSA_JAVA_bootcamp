package com.yuvraj;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//        int max = a;
//
//        if(b>max){
//            max = b;
//        }
//        if(c>max){
//            max = c;
//        }

//        int max = 0;
//        max = a>b ? a:b;
//        max = c>max ? c : max;
//        System.out.println(max);

        int max = Math.max(c, (Math.max(a,b)));
        System.out.println(max);

    }
}
