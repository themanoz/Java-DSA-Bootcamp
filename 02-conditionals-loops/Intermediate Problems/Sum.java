// 27.program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user.
// The list terminates when the user enters a zero.
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nSum=0,oSum=0,pSum=0;
        System.out.println("Enter numbers: ");
        while (true) {
            int num = in.nextInt();
            if(num==0){
                break;
            }
            if(num<0){
                nSum+=num;
            }else if (num%2==0){
                pSum+=num;
            }else {
                oSum+=num;
            }
        }
        System.out.println("Sum of negative numbers: "+nSum);
        System.out.println("Sum of positive numbers: "+pSum);
        System.out.println("Sum of odd numbers: "+oSum);


    }
}
