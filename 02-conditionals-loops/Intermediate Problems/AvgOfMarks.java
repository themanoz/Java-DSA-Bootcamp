package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class AvgOfMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many subjects: ");
        int sub = in.nextInt();
        int sum =0;
        for (int i = 1; i <= sub ; i++) {
            System.out.println("Enter "+ i + "marks: ");
            int marks = in.nextInt();
            sum+=marks;
        }
        int avg = sum /sub;
        System.out.println("Average of marks: "+avg);
    }
}
