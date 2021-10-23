package com.zavadski._1_Basics_of_software_code_development;

// Найти сумму квадратов первых ста чисел
public class task303 {
    public static void main(String[] args) {
        int n = 100, sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }
        System.out.println(sum);
    }
}