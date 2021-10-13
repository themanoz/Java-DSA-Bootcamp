// 1. Area of Circle program
package com.Manoj;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the radius: ");
	  float radius = in.nextFloat();
	  double area= Math.PI*radius*radius;
        System.out.println("Area of circle : "+area);
    }
}
