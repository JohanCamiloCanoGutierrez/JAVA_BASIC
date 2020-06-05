package usta.sistemas;
import java.time.Year;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	    DATE: 12/03/2020
	    DESCRIPTION: This program  prints two birth days and their difference
	 */
        Scanner Keyboard = new Scanner(System.in);
        int B1, B2, Difference;

        System.out.println("This program prints two birth days and their difference, Input the first number");
        B1 = Keyboard.nextInt();
        System.out.println("Input the second number");
        B2 =  Keyboard.nextInt();

        Difference = B1 - B2;
        System.out.println("The difference between of the two date years is" + Difference);
    }
}