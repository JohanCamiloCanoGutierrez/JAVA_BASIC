package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Camilo Cano
	DATE: 29/03/2020
	DESCRIPTION: This software determine a determine how long it takes for a person to go from one city to another by bicycle
	 */
        Scanner keyboard = new Scanner(System.in);
        Double Distance, velocity,Tiempo;

        System.out.println("................................................TIMESOFT......................................................");
        System.out.println(".This software determine a determine how long it takes for a person to go from one city to another by bicycle.");
        System.out.println(".......................Version: Pre alpha 0.1..................31/04/2020.....................................");
        System.out.println("..................................Created by: Camilo Cano......................................");
        System.out.println("..............................................................................................................");

        System.out.println("This software determine a determine how long it takes for a person to go from one city to another by bicycle, input the distance traveled in Km");
        Distance = keyboard.nextDouble();
        System.out.println("Input the velocity in Km/h");
        velocity = keyboard.nextDouble();
        Tiempo = Distance/velocity;
        System.out.println("The time is:"+ Tiempo + "Hours");





    }
}