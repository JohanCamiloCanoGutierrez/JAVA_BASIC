package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	DATE: 29/04/2020
	DESCRIPTION: This software read 5 numbers and show then in reverse order to the one entered
	 */
        f_menu();
        f_number_user();
    }

    public static void f_menu() {
        //This method is the menu of the software
        System.out.println("----------------------------------------");
        System.out.println("---------------REVERSESOFT---------------");
        System.out.println("-----version:1.0------29/04/2020.-------");
        System.out.println("-----Camilo Cano---------");
        System.out.println("----------------------------------------");
    }
    public static void f_number_user(){
        //Description: This method return the number user
        Scanner keyboard = new Scanner(System.in);
        int num1,num2,num3,num4,num5;
        System.out.println("Input the number 1");
        num1=keyboard.nextInt();
        System.out.println("Input the number 2");
        num2=keyboard.nextInt();
        System.out.println("Input the number 3");
        num3=keyboard.nextInt();
        System.out.println("Input the number 4");
        num4=keyboard.nextInt();
        System.out.println("Input the number 5");
        num5=keyboard.nextInt();
        System.out.println("The inverted numbers are:" +num5+", "+num4+", "+num3+", "+num2+", "+num1);
        double avergare=0;
        avergare= (num1+num2+num3+num4+num5)/5;
        System.out.println("The average is: "+ avergare);


    }
}