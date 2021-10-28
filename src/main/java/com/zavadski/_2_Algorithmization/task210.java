package com.zavadski._2_Algorithmization;

// Найти положительные элементы главной диагонали квадратной матрицы.
public class task210 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {1, 2, 0, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 1}
        };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}
