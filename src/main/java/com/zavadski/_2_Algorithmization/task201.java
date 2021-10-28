package com.zavadski._2_Algorithmization;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего

public class task201 {

    public static void main(String[] args) {
        int[][] Array = {
                {10, 9, 3, 9, 9},
                {4, 5, 6, 6, 6},
                {9, 8, 7, 6, 1}
        };
        int a = Array.length - 1;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[a].length; j++) {
                if (Array[0][j] > Array[a][j] && (j) % 2 == 0) {
                    System.out.print(Array[i][j]);
                    System.out.print('\t');
                }
            }
            System.out.println("");
        }
    }
}
