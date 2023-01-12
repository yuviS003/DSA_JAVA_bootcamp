package com.yuvraj;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Take input from user till user does not press X or x
        System.out.println("This is a Calculator. Press x or X for exit anytime.");
        double result = 0.0;
        while(true){
            // take operator from user as input
            System.out.println("Input operator");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // take two inputs
                System.out.println("Enter two numbers below");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    result = num1 + num2;
                } else if (op == '-') {
                    result = num1 - num2;
                } else if (op == '*') {
                    result = num1 * num2;
                } else if (op == '/') {
                    if (num2 == 0) {
                        System.out.println("Denominator cannot be zero");
                        result = 0;
                    } else {
                        result = num1 / num2;
                    }
                } else if (op == '%') {
                    result = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Wrong Operator");
                result=0;
            }
            System.out.println("Your result "+result);
                // New syntax switch case
//                result = switch (op) {
//                    case '+' -> num1 + num2;
//                    case '-' -> num1 - num2;
//                    case '*' -> num1 * num2;
//                    case '/' -> num2 == 0 ? 0 : num1 / num2;
//                    case '%' -> num1 % num2;
//                    default -> 0;
//                };


        }
    }
}
