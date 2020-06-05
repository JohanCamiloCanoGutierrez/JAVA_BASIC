package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	  DATE: 16/04/2020
	  DESCRIPTION: This software,Create a method that returns the first letter of a word entered as a parameter
	  Create another to capitalize the entire word.
      Create another method to remove all vowels and replace it with @.
	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_first_letter();
        } else if (option == 2) {
            f_upper_word();
        } else {
            f_replace_vowels();
        }
    }

    public static void f_menu() {
        //Description : This method shows the menu of this software
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║  CALCULATESOFT                          ║");
        System.out.println("║ Version 1.0   16/04/2020                ║");
        System.out.println("║ Created by: Camilo Cano                 ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    public static int f_option() {
        //Description; This method return the option.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the option of the convert: \n1-First letter.\n2-Capital letter.\n3-Replace vowels to @.");
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERROR: This option does not exist.");
            System.out.println("Input the option of the convert: \n1-First letter.\n2-Capital letter.\n3-Replace vowels to @.");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_first_letter() {
        //Description : This method return the first letter of a word.
        System.out.println("Input the word.");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("ERROR: This word should have a minimum of 5 letters.");
            System.out.println("Input again the word.");
            word = keyboard.nextLine();
        }
        char[] letters = word.toCharArray();
        System.out.println("The first letter is " + letters[0]);
    }

    public static void f_upper_word() {
        //Description : This method turn lowercase to uppercase.
        System.out.println("Input the word.");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("ERROR: This word should have a minimum of 5 letters.");
            System.out.println("Input again the word.");
            word = keyboard.nextLine();
        }
        System.out.println("The uppercase is " + word.toUpperCase());
    }

    public static void f_replace_vowels() {
        //Description : This method replace vowels to @.
        System.out.println("Input the word.");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        while (word.length() < 5) {
            System.err.println("ERROR: This word should have a minimum of 5 letters.");
            System.out.println("Input again the word.");
            word = keyboard.nextLine();
        }
        String word2 = word.toLowerCase();
        System.out.println("The uppercase is " + word2.replace("a", "@").replace("e", "@").replace("i", "@").replace("o", "@").replace("u", "@"));
    }
}