
package usta.sistemas;

        import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	    DATE:5/05/2020
	        DESCRIPTION: Generates the age randomly for N people and save them in a vector,
	 */
        int total_people = f_menu();
        int[]age_people =f_age_of_people(total_people);
        f_show_age(age_people);
        f_show_over_60(age_people);
        f_show_average_age(age_people);
    }

    public static int f_menu() {
        //Description: This method contain the menu oof Software
        System.out.println("------------------------------");
        System.out.println("-----------AGEVECTOR----------");
        System.out.println("---Version: 1.0  5/05/2020----");
        System.out.println("---Camilo Cano-");
        System.out.println("------------------------------");
        System.out.println("Input the TOTAL NUMBER of persons");
        Scanner keyboard = new Scanner(System.in);
        int n_persons= keyboard.nextInt();
        while (n_persons<0){
            System.out.println("ERROR: The total of person will be greater than 0");
            System.out.println("Input again the TOTAL NUMBER of persons");
            n_persons=keyboard.nextInt();
        }
        return n_persons;
    }
    public static int[] f_age_of_people(int total_people){
        //Description: This function return a vector with the age of people
        int []age_people =new int[total_people];
        for (int i=0;i<total_people;i++){
            age_people[i]=(int) Math.floor(Math.random()*80+1);
        }
        return age_people;
    }
    public static void f_show_age(int[] age_people){
        //Description: This method determine what people are over 18 and what are under.
        int total_people = age_people.length;
        int total_over_18=0, total_under_18=0;
        for (int i =0; i< total_people;i++){
            System.out.println(age_people[i]);
            if (age_people[i]<18){
                total_under_18++;
            }else{
                total_over_18++;
            }
        }
        System.out.println("The total of people under 18 are "+total_under_18);
        System.out.println("The total of people over 18 are "+total_over_18);
    }
    public static void f_show_over_60(int[] age_people) {
        //Description: This method determine what people are over 18 and what are under.
        int total_people = age_people.length;
        int total_over_60 = 0;
        for (int i = 0; i < total_people; i++) {
            System.out.println(age_people[i]);
            if (age_people[i] > 60) {
                total_over_60++;
            }
        }
        System.out.println("The total of people over 60 are "+total_over_60);
    }
    public static void f_show_average_age(int[]age_people){
        //Description= This method return the average of age of people
        int sum_age=0;
        for (int i=0;i<age_people.length;i++){
            sum_age= sum_age+age_people[i];

        }
        double average=sum_age/age_people.length;
        System.out.println("The average is: "+average);
    }

}