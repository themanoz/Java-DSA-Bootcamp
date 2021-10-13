// 1.Factorial program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class Factorial {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number to find factorial: ");
        int num = in.nextInt();
        int fact =1;
        for (int i = 2; i <=num ; i++) {
            if(num == 0){
                System.out.println(fact);
            }
            fact*=i;        }
        System.out.println(fact);
    }
}
