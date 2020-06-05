
package usta.sistemas;
        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	DATE: 21/04/2020
	DESCRIPTION: This software calculate de total salary, the average salary, and highest salary
	 */
        f_menu();
        int N= f_N_employers();
        double high_Salary =0, total_salary=0,average_Salary=0, Salary_employed;
        for (int i=1; i<=N;i=i+1){
            Salary_employed=f_salary(i);
            total_salary=total_salary+Salary_employed;
            if (high_Salary<Salary_employed){
                high_Salary=Salary_employed;
            }
            average_Salary=total_salary/N;
            System.out.println("The total salary is: "+ total_salary+", the highest salary is: "+high_Salary+"and the average salary is: "+average_Salary);

        }
    }

    public static void f_menu() {
        //Description: this method contain the menu
        System.out.println("-----------------Calculatesaved-----------------");
        System.out.println("--Version 1.0----------------21/04/2020---------");
        System.out.println("---Camilo Cano-------------------");
        System.out.println("------------------------------------------------");
    }
    public static int f_N_employers(){
        int N_employers;
        Scanner keyboard= new Scanner(System.in);
        do{
            System.out.println("input the number of employers: ");
            N_employers = keyboard.nextInt();
        }while (N_employers<=0);
        return N_employers;
    }
    public static double f_salary(int i){
        //this method return the salary of one employed
        Scanner keyboard=new Scanner(System.in);
        double sueldo, dayworks, salary;
        do {
            System.out.println("Input your waves (The value much be more than zero)");
            sueldo = keyboard.nextDouble();

        }while(sueldo<0);
        do {
            System.out.println("Input the days worked");
            dayworks=keyboard.nextDouble();
        }while(dayworks<1||dayworks>30);
        salary= sueldo/30*dayworks;
        return salary;
    }

}