package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	    DATE: 12/03/2020
	    DESCRIPTION: This software input two variable and adds
	 */
        Scanner keyboard = new Scanner(System.in);
        int v1, v2, suma ;
        System.out.println("this program adds two variable, input the fist variable");
        v1 = keyboard.nextInt();
        System.out.println("Imput the second Variable");
        v2 = keyboard.nextInt();
        suma= v1+v2;
        System.out.println("The sumatory is: " +suma);
    }
}
