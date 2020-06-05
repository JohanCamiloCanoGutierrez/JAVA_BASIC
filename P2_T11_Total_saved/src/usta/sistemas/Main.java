package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	DATE: 21/04/2020
	DESCRIPTION:This software calculate the money saved by one person in N months
	 */
        Scanner keyboard=new Scanner(System.in);
        f_menu();
        int N= f_total_months();
        int total_saved = 0,average_saved=0, money_saved;
        for (int i=1; i<=N;i=i+1){
            do {
                System.out.println("input the money the " + i + "month");
                money_saved = keyboard.nextInt();
            }while (money_saved<0);
            total_saved=total_saved+money_saved;
        }
        average_saved=total_saved/N;
        System.out.println("The total saved money is:"+total_saved+"and the average money is:"+average_saved);
    }
    public static void f_menu(){
        //Description: this method contain the menu
        System.out.println("-----------------Calculatesaved-----------------");
        System.out.println("--Version 1.0----------------21/04/2020---------");
        System.out.println("---Camilo Cano-------------------");
        System.out.println("------------------------------------------------");
    }
    public static int f_total_months(){
        int N_months;
        Scanner keyboard=new Scanner(System.in);
        do{
            System.out.println("Input the total months (THe value must be greater than zero)");
            N_months = keyboard.nextInt();
        }while (N_months<1);
        return  N_months;
    }

}