package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Camilo
	DATE: 29/04/2020
	DESCRIPTION: This software tells is how many number there are between 1 and that are prime
	 */
        f_menu();
        int number = f_User_number();
        int total_primes=0;
        for(int i=1;i<=number;i++){
            if (f_if_prime_number(i)==true){
                total_primes++;
                System.out.println("number "+i+" is prime");
            } }
        System.out.println("The total prime is: "+total_primes);
    }


    public static void f_menu() {
        //This method is the menu of the software
        System.out.println("----------------------------------------");
        System.out.println("---------------PRIMALSOFT---------------");
        System.out.println("-----version:1.0------28/04/2020.-------");
        System.out.println("-----Camilo Camilo---------");
        System.out.println("----------------------------------------");
    }
    public static int f_User_number(){
        //Description: This method return a number input by the user
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Input a number grater than 1");
        number = keyboard.nextInt();
        while (number <=1){
            System.err.println("ERROR: The number is not grater than 1, please rectify");
            System.out.println("Input again a number grater than 1");
            number= keyboard.nextInt();
        }
        return number;
    }
    public static boolean f_if_prime_number(int number){
        //Description: This method contain the fuction of n_primes
        int Count= 0;

        for(int i=1;i<=number;i++){
            if(number%i==0){
                Count=Count+1;
            }
        }
        if (Count<=2){
            return true;
        }else{
            return false;
        }
    }
}