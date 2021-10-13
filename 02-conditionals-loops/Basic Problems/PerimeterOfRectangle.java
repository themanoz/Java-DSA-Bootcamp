// 11.Perimeter of Rectangle program
        package com.Manoj;

import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of rectangle : ");
        double l = in.nextDouble();
        System.out.print("Enter the width of rectangle : ");
        double w = in.nextDouble();
        System.out.println("Perimeter of Rectangle : "+ 2*(l+w));
    }
}
