
package usta.sistemas;

public class Main {
    /*AUTHOR: Camilo Cano
        DATE: 12/05/2020
            DESCRIPTION: This program calculate the grades of one student.
     */
    public static void main(String[] args) {
        f_menu_total_number();
        double[][] grades = f_fill_matrix();
        f_show_final_grades(grades);
    }
    public static void f_menu_total_number(){
        System.out.println("---------------------------------");
        System.out.println("-----------SOFTGRADES------------");
        System.out.println("--Version 1.0     12/05/2020-----");
        System.out.println("---Camilo Cano----");
        System.out.println("---------------------------------");
    }
    public static double[][] f_fill_matrix(){
        //This  method returns the fll matrix (10*4).
        double [][] matrix = new double[10][4];
        for (int i=0; i<10;i++){
            matrix[i][0]=Math.floor((Math.random()*5)+1);
            matrix[i][1]=Math.floor((Math.random()*5)+1);
            matrix[i][2]=Math.floor((Math.random()*5)+1);
            matrix[i][3]=Math.floor((Math.random()*5)+1);
        }
        return matrix;
    }
    public static void f_show_final_grades(double[][]grades){
        //Description: This method return the final grades.
        double final_grades =0;
        for (int i=0;i<10;i++){
            final_grades=grades[i][0]*0.2+
                    grades[i][1]*.25+
                    grades[i][2]*0.25+
                    grades[i][3]*0.3;
            System.out.println("Student ("+(i+1)+"), grade 1:"+grades[i][0]+" grade 2:"+grades[i][1]+" Grade 3"
                    + grades[i][2]+" Grade 4"+grades[i][3]+" The Final grade is: "+final_grades);

        }

    }
}