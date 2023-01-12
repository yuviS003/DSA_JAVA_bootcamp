package com.yuvraj;

public class Loops {
    public static void main(String[] args) {
        // Print number from 1 to 5
        System.out.println("For Loop");
        for(int i = 1; i<=5 ; i++){
            System.out.println(i);
        }
        System.out.println("While Loop");
        int count = 1;
        while(count <=5){
            System.out.println(count);
            count++;
        }
        System.out.println("Do-While Loop");
        int temp = 1;
        do{
            System.out.println(temp);
            temp++;
        } while(temp<=5);
    }
}
