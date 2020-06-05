package usta.sistemas;
import java.util.Scanner;
public class Main<Count> {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	    DATE: 28/04/2020
	        DESCRIPTION: This software simulates a coffee machine
	 */
        int option= f_menu();
        int cost_product=f_data_product(option,1);
        int Time_product=f_data_product(option,2);
        int money= f_input_money();
        while (money<cost_product){
            System.out.println("Do you need input $"+(cost_product-money)+" Money");
            money+=f_input_money();
        }
        int sur_plus=money-cost_product;
        System.out.println("Your exchangue is: "+ sur_plus+" the product time finish is "+Time_product+" seconds" );
    }
    public static int f_menu() {
        //DESCRIPTION: This method contain the menu of the software
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.println("║                        COFFEEMACHINE                         ║");
        System.out.println("║  PRODUCTS             ║       VALUE      ║     CREATION TIME ║");
        System.out.println("║ 1. Aromatic           ║       $1300      ║        30 seconds ║");
        System.out.println("║ 2. Black Coffee       ║       $1000      ║        30 seconds ║");
        System.out.println("║ 3. Coffee with milk   ║       $1900      ║        45 seconds ║");
        System.out.println("║ 4. Cappuccino         ║       $2500      ║        60 seconds ║");
        System.out.println("║ 5. Mocha              ║       $2700      ║        70 seconds ║");
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
        System.out.println("Input the option");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 5) {
            System.err.println("ERROR: OPTION NO EXITS");
            System.out.println("Input again the option");
            option = keyboard.nextInt();
        }
        return option;
    }
    public static int f_input_money(){
        //DESCRIPTION: This method return the input money
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the money");
        int Money = keyboard.nextInt();
        while (Money < 50 || Money > 5000) {
            System.err.println("ERROR: Your money cannot be processed ");
            System.out.println("Input again the option");
            Money = keyboard.nextInt();
        }
        return Money;

    }
    public static int f_data_product(int product, int option) {
        //DESCRIPTION: This method return two choice (money or time)
        int data_product=0;
        if (product == 1) {
            if (option == 1) {
                data_product = 1300;
            } else {
                data_product = 30;
            }
        } else if (product == 2) {
            if (option == 1) {
                data_product = 1000;
            } else {
                data_product = 30;
            }
        } else if (product == 3) {
            if (option == 1) {
                data_product = 1900;
            } else {
                data_product = 45;
            }
        } else if (product == 4) {
            if (option == 1) {
                data_product = 2500;
            } else {
                data_product = 60;
            }
        } else if (product == 5) {
            if (option == 1) {
                data_product = 2700;
            } else {
                data_product = 70;
            }
        } else {

        }
        return data_product;
    }
}
