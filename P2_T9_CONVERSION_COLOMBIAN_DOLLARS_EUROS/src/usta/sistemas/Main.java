package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR; Camilo Cano
	  DATE: 16/04/2020
	  DESCRIPTION: This software converts Colombian pesos into dollars and euros.
	 */

        f_menu();
        int option = f_option();
        while (option != 0) {
            if (option == 1) {
                f_converter_pesos_to_dollars();
            } else if (option == 2) {
                f_converter_pesos_to_euros();
            } else if (option == 3) {
                f_converter_euros_to_dollars();
            }
            option = f_option();
        }
    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║ CONVERTUSTASOFT                         ║");
        System.out.println("║ Version 1.0        16/04/2020           ║");
        System.out.println("║ Created by: Camilo Cano                 ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_option() {
        //Description; This method return the option.
        System.out.println("Input the option of the convert: \n1-Pesos to dollars.\n2-Pesos to euros.\n3-Euros to dollar.\n0-Exit");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 0 || option > 3) {
            System.err.println("ERROR: This option does not exist.");
            System.out.println("Input the option of the convert: \n1-Pesos to dollars.\n2-Pesos to euros.\n3-Euros to dollar.\n0-Exit");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_converter_pesos_to_dollars() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount money in pesos.");
        int pesos = keyboard.nextInt();
        while (pesos < 1000) {
            System.err.println("ERROR: The program does not convert less than 1000.");
            System.out.println("Input again the amount money in pesos.");
            pesos = keyboard.nextInt();
        }
        double dollars = pesos * 3937.98;
        System.out.println("The amount of dollars are: " + dollars);
    }

    public static void f_converter_pesos_to_euros() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount money in pesos.");
        int pesos = keyboard.nextInt();
        while (pesos < 1000) {
            System.err.println("ERROR: The program does not convert less than 1000.");
            System.out.println("Input again the amount money in pesos.");
            pesos = keyboard.nextInt();
        }
        double euros = pesos * 4269.25;
        System.out.println("The amount of euros are: " + euros);
    }

    public static void f_converter_euros_to_dollars() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the amount money in pesos.");
        int euros = keyboard.nextInt();
        while (euros < 10) {
            System.err.println("ERROR: The program does not convert less than 1000.");
            System.out.println("Input again the amount money in pesos.");
            euros = keyboard.nextInt();
        }
        double dollars = euros * 0.92;
        System.out.println("The amount of dollars are: " + dollars);
    }
}