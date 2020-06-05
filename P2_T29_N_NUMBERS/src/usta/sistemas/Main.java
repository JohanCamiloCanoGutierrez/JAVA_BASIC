package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	    DATE: 6/05/2020
	        DESCRIPTION: This software calculates the total of products with IVA includes
	 */
        int total_numbers=f_menu_total_number();
        int[]vector_numbers=f_fill_vector(total_numbers);
        f_show_even_number(vector_numbers);
        f_show_odd_number(vector_numbers);
    }
    public static int f_menu_total_number() {
        //Description: This method contain the menu oof Software
        System.out.println("------------------------------");
        System.out.println("-----------IVAVECTOR----------");
        System.out.println("---Version: 1.0  6/05/2020----");
        System.out.println("---Camilo Cano-");
        System.out.println("------------------------------");
        Scanner keyboard= new Scanner(System.in);
        int total_numbers;
        do{
            System.out.println("Input the total of numbers do you need");
            total_numbers=keyboard.nextInt();
        }while(total_numbers<=0);
        return total_numbers;
    }
    public static int[] f_fill_vector(int total_number){
        int [] vector_numbers=new int[total_number];
        for (int i=0;i<total_number;i++){
            vector_numbers[i]=(int)Math.floor((Math.random()+(1000-100+1)+100));
        }
        return vector_numbers;
    }
    public static void f_show_even_number(int[] vector_numbers){
        //Description: This method show the even number
        int total_evens=0;
        for(int number: vector_numbers){
            if ((number%2)==0){
                total_evens++;
                System.out.println("Number : "+number);
            }
        }
        System.out.println("The total even numbers are: "+total_evens);
    }
    public static void f_show_odd_number(int[] vector_numbers){
        //Description: This method show the even number
        int total_odd=0;
        for(int number: vector_numbers){
            if ((number%2)!=0){
                total_odd++;
                System.out.println("Number : "+number);
            }
        }
        System.out.println("The total even numbers are: "+total_odd);
    }
}