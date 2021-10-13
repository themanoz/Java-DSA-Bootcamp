package com.Manoj;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        VoteOrNot(age);
    }

    static void VoteOrNot(int age) {
        if(age>=18){
            System.out.println("You can vote.");
        }else {
            System.out.println("You can't vote.");
        }
    }
}
