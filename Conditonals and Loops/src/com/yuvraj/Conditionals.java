package com.yuvraj;

public class Conditionals {
    public static void main(String[] args) {
        /*
        Syntax of if statement:
            if (boolean expression T or F) {
                    // body
            }  else{
                    //do this
            }

         */

        int salary = 25400;
        if (salary>1000){
            System.out.println( salary + 2000);
        } else {
            System.out.println(salary + 1000);
        }
    }
}