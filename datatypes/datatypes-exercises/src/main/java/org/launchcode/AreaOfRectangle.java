package org.launchcode;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the length of the Rectangle?: ");
        int length = input.nextInt();

        System.out.println("what is the width of the Rectangle?");
        int width = input.nextInt();

        System.out.println("The Area of the Rectangle is: " + length * width);

    }
}
