// 22. Java Program Vowel Or Consonant program
package com.Manoj.IntermediateProblems;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = in.next().charAt(0);
        if(ch == 'a' | ch=='e'| ch=='i'|ch=='o'|ch=='u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
