// 3. Area of Rectangle
package com.Manoj;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of rectangle :");
        double l= in.nextDouble();
        System.out.print("Enter breadth of rectangle :");
        double b = in.nextDouble();
        System.out.println("Area of Rectangle : "+ (l*b));
    }
}
