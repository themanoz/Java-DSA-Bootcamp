//4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.Manoj;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter one number: ");
        int num1 =  in.nextInt();
        System.out.print("Enter one more: ");
        int num2 = in.nextInt();
        System.out.print("1.+,2.-,3.*,4./,5.%");
        char ch =in.next().charAt(0);

        //Checking operation to perform using if else
        if (num2 == 0){
            System.out.println("Undefined");
        }else {
            if(ch=='+'){
                System.out.println(num1+num2);
            }else if (ch=='-'){
                System.out.println(num1-num2);
            }else if(ch=='*'){
                System.out.println(num1*num2);
            }else if(ch=='/'){
                System.out.println(num1/num2);
            }else {
                System.out.println("Invalid Operator");
            }
        }
    }
}
