// 6.Area of Rhombus program
package com.Manoj;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter diagonal 1 :");
        double d1 = in.nextDouble();
        System.out.print("Enter diagonal 2 :");
        double d2 = in.nextDouble();
        System.out.println("Area of Rhombus : "+ (d1*d2)/2);

    }
}
