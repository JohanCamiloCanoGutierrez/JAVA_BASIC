

package usta.sistemas;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	Date: 27/04/2020
	DESCRIPTION: This software generate de multiplication tables
	 */
        f_menu();
        int user_number= f_user_number();
        while (user_number!=0){
            f_generate_multiplication_table(user_number);
            user_number=f_user_number();
        }



    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("----------------------------");
        System.out.println("--------MATHTABLESOFT-------");
        System.out.println("-version:1.0-----27/04/2020-");
        System.out.println("-Camilo Cano-");
        System.out.println("----------------------------");
    }
    public static int f_user_number(){
        //This method return a asked number
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Input the multiply table that you need,(0 to exit)");
        int userNumb = keyboard.nextInt();
        while(userNumb < 0 || userNumb>99){
            System.err.println("Error: You only have the multiply tables");
            System.out.println("Input again the multiply table that you need (0 to exit)");
            userNumb = keyboard.nextInt();
        }
        return userNumb;
    }
    public static void f_generate_multiplication_table(int user_number){
        //This method print in the screen the multiplication table that you need
        System.out.println("the multiplication table is:");
        for (int i=1;i<=10;i++){
            System.out.println(user_number+" x "+i+" = "+user_number*i);
        }
    }
}