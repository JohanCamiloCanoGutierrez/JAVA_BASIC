
package usta.sistemas;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	DATE: 23/04/2020
	DESCRIPTION: This software calculate the number of laps of one runner, calculate the best lap, and the average.
	 */
        int Total_laps = 0;
        double Best_lap=0, average, time_lap, summatory_Time=0;
        f_menu();
        while(f_continue()==true){
            Total_laps+=1;
            time_lap=f_value_lap(Total_laps);
            summatory_Time+=time_lap;
            if (Total_laps==1){
                Best_lap=time_lap;
            }else if (Best_lap>time_lap){
                Best_lap=time_lap;
            }

        }
        average=summatory_Time/Total_laps;
        System.out.println("The best lap: "+Best_lap+", total laps: "+Total_laps+", average :"+ average);
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("----------------------------");
        System.out.println("--------RUNNERSOFT-----------");
        System.out.println("-version:1.0-----23/04/2020-");
        System.out.println("-Camilo Cano-");
        System.out.println("----------------------------");
    }
    public static boolean f_continue(){
        // Description: This method return the answer for the question dou you like continue?
        Scanner keyboard=new Scanner(System.in);
        boolean Continue;
        System.out.println("Do you like continue? (True or false)");
        Continue = keyboard.nextBoolean();
        return Continue;
    }
    public static double f_value_lap(int lap) {
        //Description: This method return the time of lap
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the time (" + lap + ")lap:");
        double time = keyboard.nextDouble();
        while (time < 1) {
            System.err.println("ERROR: The time much than 1");
            System.out.println("Input again the time(" + lap + ")lap (seconds)");
            time = keyboard.nextDouble();
        }
        return time;
    }
}