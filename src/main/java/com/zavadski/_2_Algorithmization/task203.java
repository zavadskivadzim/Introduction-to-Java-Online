package com.zavadski._2_Algorithmization;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class task203 {
    public static void main(String[] args) {
        int p = 3; //столбец
        int k = 2; //строка
        int[][] Array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {4, 2, 3, 4, 5},
                {9, 8, 7, 6, 1}
        };
        System.out.print("столбец: ");
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (j == p) {
                    System.out.print(Array[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.print("строка: ");
        for (int i = 0; i < Array.length; i++) {
            if (i == k) {
                for (int j = 0; j < Array[i].length; j++) {
                    System.out.print(Array[i][j] + " ");
                }
            }
        }
    }
}
