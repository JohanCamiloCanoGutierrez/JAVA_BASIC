package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*Author: Camilo Cano
	  Date: 19 March, 2020
	  Description: This software calculate the hypotenuse
	 */
        Scanner keyboard = new Scanner(System.in);
        double cat_1, cat_2, hypo;
        System.out.println("This software calculate the hypotenuse in cm, input the first leg in cm: ");

        cat_1 = keyboard.nextDouble();

        System.out.println("Input the second leg in cm: ");

        cat_2 = keyboard.nextDouble();

        hypo = Math.sqrt(Math.pow(cat_1, cat_2) + Math.pow(cat_1, cat_2));
        System.out.println("The result of the hypotenuse is (cm): " + hypo);








    }
}