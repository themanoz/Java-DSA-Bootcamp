// 14.Sum of N numbers program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class SumOfNNumbers {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter how many number you want to sum up :");
            int count = in.nextInt();
            int temp = 0,sum=0;
            while(temp<count){
                System.out.print("Enter number: ");
                int num = in.nextInt();
                sum+=num;
                temp++;
            }
            System.out.println("The sum is :" + sum);
        }
}

