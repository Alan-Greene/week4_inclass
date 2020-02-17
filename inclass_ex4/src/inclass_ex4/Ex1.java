package inclass_ex4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer [] sales_figures = new Integer[10];
        int total_sales = 0;

        for (int i = 0; i < sales_figures.length; i++){
            System.out.printf("Enter sales figure %d:", i + 1);
            sales_figures[i] = in.nextInt();
            total_sales += sales_figures[i];
        }

        int average_sales = total_sales / sales_figures.length;
        int max = Collections.max(Arrays.asList(sales_figures));

        for (int i = 0; i < sales_figures.length; i++){
            System.out.printf("Sales figure %d: %d%n", i + 1, sales_figures[i]);
        }

        System.out.printf("The average sales figure is: %d%n" +
                "The Largest sale was: %d", average_sales, max);
    }
}
