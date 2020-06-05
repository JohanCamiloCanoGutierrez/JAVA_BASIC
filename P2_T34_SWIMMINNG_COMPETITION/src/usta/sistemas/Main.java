package usta.sistemas;
import java.util.Scanner;
public class Main {
    /*AUTHOR: Camilo Cano
                DATE: 12/05/2020
                    DESCRIPTION: This program calculate the time of many people.
             */
    public static void main(String[] args) {
        int total_competitors = f_menu_total_competitors();
        double[][] matrix_competition = f_fill_matrix_competition(total_competitors);
        String texto = "";
        System.out.println("---------------------Table of competition------------------------");
        System.out.println("--- Player | T1 | T2 | T3 | T4 |T5 | T6 | T7 | T8 | T9 | T10 |---");
        for (int i = 0; i < total_competitors; i++) {
            texto += "\n" + (i + 1);

            for (int j = 0; j < 10; j++) {
                texto+=(" | " + matrix_competition[i][j] + " ");

            }
        }
        System.out.println(texto);
    }
    public static int f_menu_total_competitors() {
        //Description: This method show the menu.
        System.out.println("---------------------------------");
        System.out.println("--------SWIMMINNINGGRADES--------");
        System.out.println("--Version 1.0     12/05/2020-----");
        System.out.println("---Camilo Cano----");
        System.out.println("---------------------------------");
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Input who many competitors do you want");
        int total_competitors = keyboard.nextInt();
        while(total_competitors<=0){
            System.err.println("error: The Value must greater than zero");
            System.out.println("Input again who many competitors do you want");
            total_competitors= keyboard.nextInt();
        }
        return total_competitors;
    }
    public static double [][]f_fill_matrix_competition(int total_competitors){
        //Description : This method returns a fill  matrix of time the competition.
        double [][] matrix_competition = new double[total_competitors][10];
        for (int i=0;i <total_competitors;i++){
            for (int j=0;j<10 ; j++){
                matrix_competition[i][j]= Math.floor(Math.random()*(10-6)+6);
            }
        }
        return matrix_competition;
    }
}