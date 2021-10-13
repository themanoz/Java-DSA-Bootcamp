// 2. Area of Triangle program
package com.Manoj;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of triangle:");
        double b=in.nextDouble();
        System.out.print("Enter the height of traingle:");
        double h= in.nextDouble();

        double area = (b*h)/2;
        System.out.println("Area of Triangle : "+ area);
    }
}
