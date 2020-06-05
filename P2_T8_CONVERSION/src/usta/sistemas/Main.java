
package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	  DATE: 16/04/2020
	  DESCRIPTION: This software converts kilometers into miles, kilometers into yards and upside down.
	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_kilometers_to_miles();
        } else if (option == 2) {
            f_kilometers_to_yards();
        } else if (option == 3) {
            f_miles_to_kilometers();
        } else
            f_yards_to_kilometers();
    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ CONVERTUSTASOFT                         ║");
        System.out.println("║ Version 1.0    16/04/2020               ║");
        System.out.println("║ Created by: Camilo Cano                 ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_option() {
        //Description; This method return the option.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option of the convert: \n1-Kilometers to miles.\n2-Kilometers to yards.\n3-Miles to kilometers.\n4-Yards to kilometers.");
        int option = keyboard.nextInt();
        while (option < 1 || option > 4) {
            System.err.println("ERROR: This option does not exist.");
            System.out.println("Input the option of the convert: \n1-Kilometers to miles.\n2-Kilometers to yards.\n3-Miles to kilometers.\n4-Yards to kilometers.");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_kilometers_to_miles() {
        //Description: This method converts kilometers into miles.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double miles = kilometers * 0.6214;
        System.out.println("The miles are: " + miles + " miles");
    }

    public static void f_kilometers_to_yards() {
        //Description: This method converts kilometers into yards.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double yards = kilometers * 1093.6;
        System.out.println("The yards are: " + yards + " yd");
    }

    public static void f_miles_to_kilometers() {
        //Description: This method converts miles to kilometers.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in miles (ml)");
        double miles = keyboard.nextDouble();
        double kilometer = miles / 0.62137;
        System.out.println("The kilometers are: " + kilometer + " km");
    }

    public static void f_yards_to_kilometers() {
        //Description: This method converts yards to kilometers.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the value in yards (yd)");
        double yards = keyboard.nextDouble();
        double kilometers = yards / 1093.6;
        System.out.println("The kilometers are: " + kilometers + " km");
    }
}