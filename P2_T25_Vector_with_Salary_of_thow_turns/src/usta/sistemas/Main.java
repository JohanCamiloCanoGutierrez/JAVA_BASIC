package usta.sistemas;

public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	    DATE: 3/05/2020
	        DESCRIPTION: This software save, the salary per turn, (day, afternoon), and after print hte salary in the screen
	 */
        f_menu();
        int[]turn_morning = f_salary_turn();
        int[]tur_afternoon=f_salary_turn();
        int salary_total_morning= f_show_morning(turn_morning);
        int salary_total_afternoon=f_show_afternoon(tur_afternoon);
        System.out.println("The total salary (morning + afternoon) = "+(salary_total_afternoon+salary_total_morning));
    }

    public static void f_menu() {
        //Description: This method contain the menu oof Software
        System.out.println("------------------------------");
        System.out.println("-------TWOVECOTRYSALARY-------");
        System.out.println("---Version: 1.0  4/05/2020----");
        System.out.println("---Camilo Cano-");
        System.out.println("------------------------------");
    }
    public static int[] f_salary_turn(){
        //This method return the salary of 8 employees
        int[] salary = new int[8];
        for (int i=0;i<8;i++){
            salary[i] =(int) Math.floor(Math.random()*(2000000-980658)+980658);
        }
        return salary;
    }
    public static int f_show_morning(int[]turn_morning){
        //description: this method show the slary by turn of morning
        System.out.println("-----------turn morning---------");
        int total_salary=0;
        for (int i=0;i<8;i+=1){
            total_salary+= turn_morning[i];
            System.out.println("The salary of employed ("+(i+1)+") :"+turn_morning[i]);
        }
        System.out.println("The total salary bu turn of morning is: "+total_salary);
        return total_salary;
    }
    public static int f_show_afternoon (int[]turn_afternoon) {
        //description: this method show the slary by turn of afternoon
        System.out.println("-----------turn morning---------");
        int total_salary = 0;
        for (int i = 0; i < 8; i += 1) {
            total_salary += turn_afternoon[i];
            System.out.println("The salary of employed (" + (i + 1) + ") :" + turn_afternoon[i]);
        }
        System.out.println("The total salary bu turn of murning is: " + total_salary);
        return total_salary;
    }
}