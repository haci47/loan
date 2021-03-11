package haci.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of debt you will receive.");
        double dept = scan.nextDouble();

        for (int i = 0; i <6 ; i++) {
            dept -= (dept/10);

            System.out.println("\trest of dept :" +dept);

        }
        System.out.println("\tRemaining debt after 6 months :" +dept);
    }
}
