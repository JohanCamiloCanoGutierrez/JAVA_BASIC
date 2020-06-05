
package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*AUTHOR: Camilo Cano
	  DATE: 14/04/2020
	  Description: This software asks for two numbers and says if they are the same or not.
	 */
        f_menu();
        boolean rpta = f_compare();
        if (rpta== true){
            System.out.println("------------------------------");
            System.out.println("-The two numbers are the same-");
            System.out.println("------------------------------");
        }else{
            System.out.println("---------------------------------");
            System.out.println("-the two numbers aren´t the same-");
            System.out.println("---------------------------------");
        }
    }
    public static void  f_menu(){
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("║CompareSoft                              ║");
        System.out.println("║ Versión 1.0              14/04/2020     ║");
        System.out.println("║ Creted by: : camilo Cano                ║");
        System.out.println("╚═════════════════════════════════════════╝");
    }
    public static boolean f_compare(){
        Scanner keyboard = new Scanner(System.in);
        int v1,v2;
        boolean rpta;
        System.out.println("This software asks for two integer numbers and says if they are the same or not.");
        System.out.println("Input the first number");
        v1=keyboard.nextInt();
        System.out.println("Input the second number");
        v2= keyboard.nextInt();
        if (v1==v2){
            rpta=true;
        }else{
            rpta=false;
        }
        return rpta;
    }
}