package de.bfz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // User Eingabe von der Körpergröße
        System.out.print("Bitte Körpergröße in Meter eingeben: ");
        Scanner sc = new Scanner(System.in);
        double numK = sc.nextDouble();

        // User Eingabe vom Körpergewicht
        System.out.print("Bitte Körpergewicht in Kilorgramm (gerundet) eingeben: ");
        int numG = sc.nextInt();

        // Scanner schließen
        sc.close();

        // Ergebnis Variablen
        double bmi = 0;
        double summeK = 0;

        // Berechnung
        summeK = numK * numK;
        bmi = numG / summeK;

        // Ausgabe
        System.out.println("Dein BMI ist: " + bmi);
    }
}
