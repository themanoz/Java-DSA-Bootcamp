// 7.Power in java program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base:");
        double b = in.nextDouble();
        System.out.println("Enter power:");
        double p = in.nextDouble();
        double power = Math.pow(b,p);
        System.out.println(power);

    }
}
