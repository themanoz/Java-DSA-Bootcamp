// 8.Perimeter of Circle program
package com.Manoj;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius :" );
        double r = in.nextDouble();
        double area = 2*Math.PI*r;
        System.out.println("Perimeter of Circle: " + area);
    }
}
