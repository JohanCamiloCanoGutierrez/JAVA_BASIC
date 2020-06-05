package Usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	  DATE: 30/03/2020
	  DESCRIPTION: This software calculate how you saved money in every week for one year
	 */
        f_menu();
        f_saved_money();
    }
    public static void f_menu(){

        System.out.println("-------------------SAVINGSOFT.........................");
        System.out.println("-This Software calculate how you saved money every week.");
        System.out.println("...Version: Pre-Alpha 1.0.....1/04/2020.................");
        System.out.println(".......Created by: Camilo Cano...........");
        System.out.println("........................................................");
    }

    public static void f_saved_money() {
        Scanner keyboard = new Scanner(System.in);
        double salary, s_money, s_money2, s_money3;
        System.out.println("Input your salary");
        salary = keyboard.nextDouble();

        if (salary <= 0) {
            System.err.println("ERROR: Your salary not can 0, please input your real salary " );
        } else {
            s_money = salary * 0.15;
            s_money2 = s_money * 4;
            s_money3 = s_money2 * 12;

            System.out.println(" your saving money in the month is $" + s_money2);
            System.out.println("Your saving money in a year (12 months) will be $" + s_money3);
        }
    }
}
