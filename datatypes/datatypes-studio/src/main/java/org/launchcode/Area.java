package org.launchcode;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Double.NaN;
import static java.lang.Double.parseDouble;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
//        boolean userInput = input.hasNextDouble();
//         if(Double.isNaN(radius)){
//            System.out.println("This is not a number. Try again");
//        }
         if(radius < 0){
            System.out.println("Number must be positive. Try again");
        }
        else {
            input.close();
            double areaOfCircle = Circle.getArea(radius);
            System.out.println("the area of the circle with a radius of  " + radius + " is " + areaOfCircle);
        }
    }

}
