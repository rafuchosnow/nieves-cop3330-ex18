/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rafael Nieves
 */

package org.example;

import java.util.Scanner;
import java.text.DecimalFormat;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" +
                           "Press F to convert from Celsius to Fahrenheit.");

        System.out.print("Your choice: ");
        String tempString = input.nextLine();

        if (tempString.equals("C") || tempString.equals("c")) {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String fahtocelString = input.nextLine();
            double fahtocelNumber = Double.parseDouble(fahtocelString);

            double celsius = (fahtocelNumber - 32) * (5.0 / 9.0);

            System.out.println("The temperature in Celsius is " + celsius + ".");
        }
        if (tempString.equals("F") || tempString.equals("f")) {
            System.out.print("Please enter the temperature in Celsius: ");
            String celtofahString = input.nextLine();
            double celtofahNumber = Double.parseDouble(celtofahString);

            double fahrenheit = ((celtofahNumber * 9) / 5) + 32;

            System.out.println("The temperature in Fahrenheit is " + fahrenheit + ".");
        }
    }
}
