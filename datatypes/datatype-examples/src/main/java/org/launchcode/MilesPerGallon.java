package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have your drive?: ");
        int miles =input.nextInt();

        System.out.println("How many Gallons of gas have your consumed?: ");
        int gallons = input.nextInt();

        System.out.println("MPG: " + miles / gallons);
    }
}
