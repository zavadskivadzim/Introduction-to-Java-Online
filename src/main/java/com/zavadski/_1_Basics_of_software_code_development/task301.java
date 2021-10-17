package com.zavadski._1_Basics_of_software_code_development;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число.
//  А программа суммирует все числа от 1 до введенного пользователем числа
public class task301 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= (int) n; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + n + ": " + sum);
    }
}