
package usta.sistemas;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	DATE: 22/04/2020
	DESCRIPTION: A housewife needs to make the market of the month and only have $500000
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int summatory = 0, cost_product, total_product=0;
        do {
            total_product+=1;
            System.out.println("Input the cost of the product:("+total_product+")");
            cost_product = keyboard.nextInt();
            summatory+=cost_product;
            System.out.println("the temporaly bill is "+summatory);
        }while(summatory<=500000);
        summatory-=cost_product;
        total_product-=1;
        System.out.println("total bill: "+ summatory+", total product:"+ total_product);
    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("----------------------------");
        System.out.println("--------MarketSOFT-----------");
        System.out.println("-version:1.0-----22/04/2020-");
        System.out.println("-Camilo Cano-");
        System.out.println("----------------------------");
    }
}