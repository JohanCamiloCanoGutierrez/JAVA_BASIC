package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Camilo Cano
	  DATE: 14/04/2020
	  DESCRIPTION: This software calculates the area of the circle, square or triangle.
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int opt = keyboard.nextInt();
        if (opt < 1 || opt > 3) {
            System.err.println("ERROR: This option does not exist");
        } else {
            if (opt == 1) {
                //llamar la función de area de circulo
                f_area_circle();
            } else if (opt == 2) {
                //llamar la opción de area de cuadrado
                f_area_square();
            } else {
                //llamar la opcion de area de triangulo
                f_area_triangle();
            }
        }
    }
    public static void f_menu () {
        System.out.println("-----------------------------------");
        System.out.println("---------------AreaSoft------------");
        System.out.println("----Version: 1.0     14/04/2020----");
        System.out.println("Created: Camilo Cano");
        System.out.println("-----------------------------------");
        System.out.println("Input the option of the figure: \n1-Circle\n2-Square\n3-Triangle");
    }
    public static void f_area_circle () {
        //Description: this method calculates the area of a circle
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The area of circle is necessary the radius, input this value (cm)");
        double radius = keyboard.nextDouble();
        double area = (radius*radius)*3.141517;
        System.out.println("The area of the circle is :"+area+" (cm)");
    }
    public static void f_area_square () {
        //Description: this method calculates the area of a square
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The area of square is necessary the side, input this value (cm)");
        double side = keyboard.nextDouble();
        double area = (side*side);
        System.out.println("The area of the square is: "+area+" (cm)");
    }
    public static void f_area_triangle () {
        //Description: this method calculates the area of a triangle
        Scanner keyboard = new Scanner(System.in);
        double base, height,area;
        System.out.println("The area of triangle is necessary the base and height, input the value base value (cm)");
        base = keyboard.nextDouble();
        System.out.println("Input the height on (cm)");
        height = keyboard.nextDouble();
        area=(base*height)/2;
        System.out.println("The area of triangle is: "+area+" (cm)");
    }
}