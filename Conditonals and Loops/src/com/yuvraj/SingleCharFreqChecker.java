package com.yuvraj;

import java.util.Scanner;

public class SingleCharFreqChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int p = num;
        System.out.print("Enter a single digit: ");
        int digit = in.nextInt();
        int frequency = 0;
        while(p!=0){
            int ld = p%10;
            if(ld == digit){
                frequency++;
            }
            p/=10;
        }

        System.out.println("Frequency of "+digit+" in "+num+" is "+frequency);

    }
}
