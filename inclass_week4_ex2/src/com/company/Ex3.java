package com.company;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                System.out.printf("Element at an even index: %d%n", arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                System.out.printf("Even elements: %d%n", arr[i]);
            }
        }

        for (int i = arr.length - 1; i >= 0; i--){
            System.out.printf("Elements in reverse order: %d%n", arr[i]);
        }

        System.out.println("First number: " + arr[0]);
        System.out.println("Last number: " + arr[arr.length - 1]);

    }
}
