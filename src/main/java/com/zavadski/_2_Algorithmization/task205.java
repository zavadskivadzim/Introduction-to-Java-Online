package com.zavadski._2_Algorithmization;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное

public class task205 {
    public static void main(String[] args) {
        int n = 6;
        int[][] Array = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (j < (Array[i].length) - i) {
                    Array[i][j] = i + 1;
                } else {
                    Array[i][j] = 0;
                }
                System.out.print(Array[i][j]);
                System.out.print('\t');
            }
        }
    }
}
