package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.close();
        double areaOfCircle = Circle.getArea(radius);
        System.out.println("the area of the circle with a radius of  " + radius + " is " + areaOfCircle);
    }
}
