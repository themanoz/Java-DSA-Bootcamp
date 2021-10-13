// 5. Calculate distance between 2 points  program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class DistanceBtTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter x1:");
        double x1 = in.nextInt();;
        System.out.println("enter x2: ");
        double x2 = in.nextInt();
        System.out.println("enter y1: ");
        double y1 = in.nextInt();
        System.out.println("enter y2: ");
        double y2 = in.nextInt();
        double dis = Math.sqrt( (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1) );
        System.out.println("Dstance between 2 points is: " +dis);
    }
}
