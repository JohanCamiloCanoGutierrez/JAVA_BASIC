package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
    AUTHOR: Camilo Cano
    DATE: 20/04/2020
    DESCRIPTION: This software calculate the average age of N children
	 */
        f_menu();
        int total_children = f_total_children();
        double summatory =0, average=0;
        for(int i=1;i<=total_children;i=i+1){
            summatory=summatory+f_height_children(i);
        }
        average = summatory/total_children;
        System.out.println("the average is: "+ average);
    }

    public static void f_menu() {
        //This method contain the code of the menu
        System.out.println("----------------------------");
        System.out.println("--------SoftChild-----------");
        System.out.println("-version:1.0-----20/04/2020-");
        System.out.println("-Camilo Cano-");
        System.out.println("----------------------------");
    }
    public static int f_total_children(){
        //Description: This method contain the code of the total children
        System.out.println("input the total children, to calculate the age");
        Scanner keyboard = new Scanner(System.in);
        int children= keyboard.nextInt();
        while(children<1){
            System.err.println("ERROR: Your input the incorrect value, be grater than zero");
            System.out.println("input again the total children, to calculate the age");
            children = keyboard.nextInt();
        }
        return children;
    }
    public static double f_height_children(int i){
        //Description: This method return the height of a children
        Scanner keyboard= new Scanner(System.in);
        System.out.println("input the height of child ("+i+") : ");
        double height = keyboard.nextDouble();
        while(height<0.2||height>2){//20 cm o 2 m
            System.err.println("ERROR: The values should be between 0.2 and 2");
            System.out.println("input again the height of child ("+i+") : ");
            height=keyboard.nextDouble();
        }
        return height;
    }

}