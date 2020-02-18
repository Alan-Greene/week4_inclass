package com.company;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total_price = 0.0;

        final int NUM_PRICES = 5;

        double [] prices = new double[NUM_PRICES];

        for (int i = 0; i < NUM_PRICES; i++){
            System.out.printf("Please enter price #%d", i+1);
            prices[i] += in.nextDouble();
            total_price += prices[i];
        }

        System.out.printf("total: €%.2f%n", total_price);

        double average_price = total_price / NUM_PRICES;

        System.out.printf("Average: €%.2f%n", average_price);

        System.out.println("Prices less than €5:");
        for (int i = 0; i < NUM_PRICES; i++){
            if (prices[i] < 5.0) {
                System.out.printf("Price: €%.2f%n", prices[i]);
            }
        }

        System.out.printf("Prices higher than the average of: %.2f%n", average_price);
        for (int i = 0; i < NUM_PRICES; i++){
            if (prices[i] > average_price) {
                System.out.printf("Price: €%.2f%n", prices[i]);
            }
        }

    }
}
