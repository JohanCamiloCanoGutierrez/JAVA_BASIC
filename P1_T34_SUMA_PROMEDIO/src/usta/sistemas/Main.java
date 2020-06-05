package usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	    DATE: 12/03/2020
	   DESCRIPTION: This program adds and find the average of three variable
	 */
        Scanner Keyboard = new Scanner(System.in);
        int v1,v2,v3, suma;
        double average;


        System.out.println("This program add three numbers, and then, it find the average, input the first variable");
        v1 = Keyboard.nextInt();
        System.out.println("Input the second variable");
        v2 = Keyboard.nextInt();
        System.out.println("Input the tree variable");
        v3 = Keyboard.nextInt();

        suma = v1 + v2 + v3;
        average = suma/3;
        System.out.println("The result of the add is:"+suma);
        System.out.println("The result of the average is:"+average);





    }
}