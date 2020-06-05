package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	DATE: 22/04/2020
	DESCRIPTION: This software, show in the screen numbers less to 100, and after determine the sum and avergare
	 */
        f_menu();
        Scanner keyboard= new Scanner (System.in);
        int total_number =0;
        double summatory=0, average=0,number;
        System.out.println("input a number: ");
        number = keyboard.nextDouble();
        while(number>100 ){
            summatory=summatory+number;
            total_number+=1;
            System.out.println("input other number: ");
            number = keyboard.nextDouble();
        }
        if (total_number!=0){
            average=summatory/total_number;
        }
        System.out.println("The summatory of "+total_number+" is "+summatory+" and the average is "+average);
    }
    public static void f_menu(){
        //Description: This method show the menu of this software
        System.out.println("----------------------------");
        System.out.println("--------Softnumbers-----------");
        System.out.println("-version:1.0-----22/04/2020-");
        System.out.println("-Camilo Cano-");
        System.out.println("----------------------------");
    }
}