package com.Manoj;

import java.util.Scanner;

public class CircNdArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = in.nextDouble();
        System.out.println("Area of Circle: "+area(radius));
        System.out.println("Circumference of Circle: "+circumference(radius));
    }

    static  double area(double radius){
        return Math.PI*radius*radius;
    }
    static double circumference(double radius) {
        return 2*Math.PI*radius;
    }
}
