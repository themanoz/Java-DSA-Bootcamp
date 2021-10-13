// 4.Area of Isosceles Triangle
package com.Manoj;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter equal sides of triangle :");
        double a = in.nextDouble();
        System.out.print("Enter final side of triangle :");
        double b = in.nextDouble();

        double area = (b/4)*Math.sqrt((4*a*a)-(b*b));
        System.out.println("Area of Isosceles Traingle :" +area);
    }
}
