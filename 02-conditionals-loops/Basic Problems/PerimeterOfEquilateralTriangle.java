// 9.Perimeter of Equilateral Triangle program
package com.Manoj;

import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of triangle: ");
        double a = in.nextDouble();
        System.out.println("Perimeter  of Equilateral Triangle: " + 3*a);

    }
}
