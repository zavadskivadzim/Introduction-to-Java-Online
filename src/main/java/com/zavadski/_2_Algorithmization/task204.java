package com.zavadski._2_Algorithmization;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class task204 {
    public static void main(String[] args) {
        int k = 5;
        int n = 2 * k;
        int[][] Array = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    Array[i][j] = j + 1;
                    System.out.print(Array[i][j]);
                    System.out.print('\t');
                }
            } else {
                for (int j = 0; j < n; j++) {
                    Array[i][j] = n - j;
                    System.out.print(Array[i][j]);
                    System.out.print('\t');
                }
            }
        }
    }
}
