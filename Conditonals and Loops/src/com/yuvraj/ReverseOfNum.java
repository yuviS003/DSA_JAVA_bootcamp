package com.yuvraj;

import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int reverse = 0;
        int p = num;

        while(p!=0){
            int ld = p % 10;
            reverse =reverse * 10 + ld;
            p=p/10;
        }

        System.out.println("The reverse of " + num + " is " + reverse);

    }
}
