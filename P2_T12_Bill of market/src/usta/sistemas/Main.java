package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	DATE: 21/04/2020
	DESCRIPTION: This software calculate gross value and value gross +VAT(19%)
	 */
        f_menu();
        int N = f_total_products();
        double total_bill = 0;
        for (int i=1; i<=N;i=i+1){
            total_bill=total_bill+f_value_product(i);
        }
        System.out.println("The total bill is: "+total_bill);

    }
    public static void f_menu() {
        //Description: this method contain the menu
        System.out.println("-----------------Billfsoft-----------------");
        System.out.println("--Version 1.0----------------21/04/2020---------");
        System.out.println("---Camilo Cano-------------------");
        System.out.println("------------------------------------------------");
    }
    public static int f_total_products(){
        //Description: This method return the total products
        Scanner keyboard= new Scanner(System.in);
        int N_products;
        do{
            System.out.println("input the total of products");
            N_products= keyboard.nextInt();
        }while (N_products<0);
        return N_products;
    }
    public static double f_value_product(int i){
        //Description: this method return the value products
        System.out.println("Input the value of the products ("+i+"): ");
        Scanner keyboard= new Scanner(System.in);
        double Value_product = keyboard.nextDouble();
        while(Value_product<=0){
            System.err.println("ERROR: The value of products much more greater than zero");
            System.out.println("Input again the value of products ("+i+"):");
        }
        if (Value_product>1000){
            Value_product=Value_product*1.19;
        }
        return Value_product;
    }
}