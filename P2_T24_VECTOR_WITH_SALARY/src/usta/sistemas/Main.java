package usta.sistemas;

import java.util.Random;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	DATE: 4/05/2020
	DESCRIPTION:Saves the salarys of 5 employes using
	 */
        f_menu_product();
        int[]salary_of_employees = f_salary();
        f_show_salary(salary_of_employees);

    }
    public static void f_menu_product(){
        //Description: This method contain the menu oof Software
        System.out.println("------------------------------");
        System.out.println("------SOFTVECOTRYSALARY-------");
        System.out.println("---Version: 1.0  4/05/2020----");
        System.out.println("---Camilo Cano-");
        System.out.println("------------------------------");
    }
    public static int[] f_salary(){
        //Description:This method returns a vector with salary of five employees
        Random rand =new Random();
        int[] salarys= new int[5];//This var to save the salary of five employees
        for (int i =0;i<5;i++){
            salarys[i] =(int) Math.floor(Math.random()*(2000000-1000000+1)+1000000);
        }
        return salarys;
    }
    public static void  f_show_salary(int[]salary) {
        //description: This method show the vector with the salary
        System.out.println("-------List of salary------");
        for (int i = 0; i < 5; i++) {
            System.out.println("The Salary of (" + (i + 1) + ") is: " + salary[i]);
        }
    }