package com.company;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int scores[] = new int[5];

        for (int i = 0; i < scores.length; i++){
            System.out.printf("Please enter score #%d", i+1);
            scores[i] += in.nextInt();
        }

        int max = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max){
                max = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++){
            System.out.printf("The difference from the max to score 1 is: %d%n", max - scores[i]);
        }
    }

}
