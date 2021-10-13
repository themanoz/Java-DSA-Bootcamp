package com.Manoj;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter range: ");
        int range = in.nextInt();
        System.out.println("Sum of n numbers: "+sumOfN(range));
    }

    static int sumOfN(int range) {
        int sum = 0;
        for (int i = 0; i <=range ; i++) {
            sum+=i;
        }
        return sum;
    }
}
