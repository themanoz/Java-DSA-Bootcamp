// 7.Area of Equilateral Triangle program
package com.Manoj;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of triangle: ");
        double a = in.nextDouble();
        double area = (Math.sqrt(3)*a*a)/4;
        System.out.println("Area of Equilateral Triangle : " +area);
    }
}
