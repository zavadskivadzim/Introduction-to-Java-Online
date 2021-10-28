package com.zavadski._2_Algorithmization;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное
public class task206 {
    public static void main(String[] args) {
        int n = 10;
        int[][] Array = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (i < Array.length / 2) {
                    if ((j < ((Array[i].length) - i)) && (j > (i - 1))) {
                        Array[i][j] = 1;
                    } else {
                        Array[i][j] = 0;
                    }
                } else {
                    if ((j < (i + 1)) && (j > ((Array[i].length) - i - 2))) {
                        Array[i][j] = 1;
                    } else {
                        Array[i][j] = 0;
                    }
                }

                System.out.print(Array[i][j]);
                System.out.print('\t');
            }
        }
    }
}
