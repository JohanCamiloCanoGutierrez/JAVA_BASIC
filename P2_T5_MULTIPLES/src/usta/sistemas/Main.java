package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	  DATE: 14/04/2020
	  DESCRIPTION: This software asks for two numbers and says if one is a multiple of the other.
	 */
        f_menu();
        f_input_numbers();
    }
    public static void f_menu() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║CompareSoft 2.0                          ║");
        System.out.println("║ Versión 2.0          14/04/2020         ║");
        System.out.println("║ Created by: Camilo Cano                 ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
    public static boolean f_multiplo(int n1, int n2) {
        //Description: This function determinate if the numbers are multiple of the other.
        boolean multiplo = false;
        if (n1 % n2 == 0) {
            multiplo = true;
        }
        return multiplo;
    }
    public static void f_input_numbers(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This software asks for two numbers and says if one is a multiple of the other, input the first integer number");
        int n1 = keyboard.nextInt();
        System.out.println("Input the second integer number");
        int n2= keyboard.nextInt();
        boolean rpta = f_multiplo(n1,n2);
        if (rpta==true){
            System.out.println(n1+" is multiple of "+n2);
        }
        else {
            System.out.println(n1+" is not multiple of "+n2);
        }
    }
}
