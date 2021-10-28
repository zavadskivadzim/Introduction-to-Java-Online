package com.zavadski._2_Algorithmization;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму

public class task209 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 0, 1, 1, 1},
                {1, 0, 8, 9, 0},
                {1, 0, 3, 4, 5},
                {1, 0, 8, 9, 0},
                {1, 2, 7, 1, 1}
        };
        int columnSum[] = new int[array.length];
        int sum;
        int maxSum = 0;
        int index = 0;
        int k1;
        for (int j = 0; j < array[0].length; j++) {
            k1 = j;
            sum = 0;
            for (int l = 0; l < array.length; l++) {
                columnSum[l] = array[l][k1];
                sum += columnSum[l];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = k1;
            }
            System.out.println("сумма " + k1 + " столбца: " + sum);
        }
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println("Максимальная сумма в столбце под номером " + index);
    }
}
