// 10.Calculate CGPA  program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many subjects: ");
        int sub = in.nextInt();
        int sum =0;
        System.out.println("Enter marks: ");
        for (int i = 1; i <=sub ; i++) {
            int marks = in.nextInt();
            sum = sum+marks;
        }
        double cgpa = sum / sub;
        System.out.println("CGPA is "+ cgpa);

    }
}
