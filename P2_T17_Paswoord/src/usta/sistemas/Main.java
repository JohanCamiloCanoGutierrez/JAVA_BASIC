
package usta.sistemas;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Angel Manuel Correa Rivera
	DATE:23/04/2020
	DESCRIPTION: This software is a menu login, and the user have 3 attemps to write the password
	 */
        int n_attemps = 0,p;
        f_menu();
        f_password();




    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("----------------------------");
        System.out.println("--------PASSSOFT-----------");
        System.out.println("-version:1.0-----23/04/2020-");
        System.out.println("-Camilo Cano-");
        System.out.println("----------------------------");
    }
    public static int f_password (){
        //Description: This method return the attemps of the password
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Input the Password");
        int Password = keyboard.nextInt();
        if (Password!=352||Password!=259||Password!=569){
            System.err.println("ERROR: The password is wrong, try again");
            System.out.println("Input again the password");
            Password=keyboard.nextInt();
        }else if(Password==352||Password==259||Password==569){


            System.out.println("The password is correct");
        }
        return Password;
    }

}