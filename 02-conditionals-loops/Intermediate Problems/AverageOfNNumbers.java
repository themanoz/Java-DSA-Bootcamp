// 3.Calculate Average of N numbers program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter range:");
        int num = in.nextInt();
        int sum =0,avg;
        int i=0;
        while(i<num){
            System.out.println("Enter number: ");
            int n = in.nextInt();
            sum = sum+n;
            i++;
        }
        avg = sum/num;
        System.out.println("Average of N numbers :"+avg);

    }
}
