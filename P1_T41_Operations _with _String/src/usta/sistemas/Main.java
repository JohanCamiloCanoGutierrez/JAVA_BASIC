package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	    DATE: 26/03/2020
	    DESCRIPTION: This software realizes many operations with strings
	 */
        Scanner keyboard = new Scanner(System.in);
        String Name;
        System.out.println("-------------------------------------------------------------");
        System.out.println("                           SOFTNAME                          ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Imput your name ");
        Name = keyboard.nextLine();
        if (Name.indexOf("gomez") != -1) {
            System.out.println("gomez already exists");
        } else {
            System.out.println("gomez doesn't exists");
        }
        System.out.println("The upper name is" + " " + Name.toUpperCase());
        System.out.println(Name.replace("a", "@"));
        System.out.println(Name.substring(7,12));




    }
}