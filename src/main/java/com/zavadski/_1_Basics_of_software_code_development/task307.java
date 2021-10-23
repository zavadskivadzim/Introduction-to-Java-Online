package com.zavadski._1_Basics_of_software_code_development;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители,
// кроме единицы и самого числа. m и n вводятся с клавиатуры
public class task307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int k = scanner.nextInt();
        System.out.println("Введите конечное число: ");
        int n = scanner.nextInt();

        for (int m = k; m <= n; m++) {
            System.out.print("Для числа " + m + ": ");
            for (int i = 1; i <= m; i++) {
                if (((m % i) == 0) && ((m / i) != 1) && (i != 1)) {
                    System.out.print(i + " ");
                }
            }
            System.out.print('\n');
        }
    }
}