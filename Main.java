package com.KaZuN;

import java.util.Scanner;

public class Main{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles: ");
        int distanceInMiles = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("How many extra yards beside of miles: ");
        int distanceOfYards = scanner2.nextInt();

        double MilesToKm = distanceInMiles * 1.609;
        double YardsToKm = distanceOfYards / 1760;

        System.out.println("Full distance in kilo meters:" + (MilesToKm + YardsToKm));
    }
}
