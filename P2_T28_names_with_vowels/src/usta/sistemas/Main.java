package usta.sistemas;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
        DATE: 6/05/2020
            DESCRIPTION: This software ask N number of people's names and determine how may names have the letter "a" and how many have the letter "e"
	 */
        int Total_person=f_menu_total_person();
        String[] vector_names = f_fill_vector(Total_person);
        f_show_letter_a(vector_names);
        f_show_letter_e(vector_names);
    }
    public static int f_menu_total_person() {
        //Description: This method contain the menu oof Software
        System.out.println("------------------------------");
        System.out.println("-----------NAMEVECTOR----------");
        System.out.println("---Version: 1.0  6/05/2020----");
        System.out.println("---Camilo Cano-");
        System.out.println("------------------------------");
        System.out.println("Input the total person do you need");
        Scanner keyboard = new Scanner(System.in);
        int Total_person = keyboard.nextInt();
        while(Total_person<0){
            System.err.println("ERR: The total Of person will be greater than zero");
            System.out.println("Please, Input again the total person do you need");
            Total_person = keyboard.nextInt();
        }
        return Total_person;
    }
    public static String[] f_fill_vector(int Total_person){
        //DESCRIPTION: This method return a fill vector
        String[] vector_names= new String[Total_person];
        Scanner keyboard= new Scanner(System.in);
        for(int i=0;i< Total_person;i++){
            System.out.println("Input the name by person "+(i+1));
            vector_names[i]= keyboard.nextLine();
        }
        return vector_names;

    }
    public static void f_show_letter_a(String[] vector_name){
        //DESCRIPTION: This method counts the names that have the letter a
        int Total_words=0;
        for (int i=0;i<vector_name.length;i++){
            if(vector_name[i].indexOf("a")>=0){
                Total_words++;
            }
        }
        System.out.println("The total letter a are: "+Total_words);
    }
    public static void f_show_letter_e(String[] vector_name) {
        //DESCRIPTION: This method counts the names that have the letter a
        int Total_words = 0;
        for (int i = 0; i < vector_name.length; i++) {
            if (vector_name[i].indexOf("e") >= 0) {
                Total_words++;
            }
        }
        System.out.println("The total letters a are: " + Total_words);
    }