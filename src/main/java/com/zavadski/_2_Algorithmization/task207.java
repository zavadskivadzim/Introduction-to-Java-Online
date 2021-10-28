package com.zavadski._2_Algorithmization;

//Сформировать квадратную матрицу порядка N по правилу
public class task207 {
    public static void main(String[] args) {
        int n = 4;
        int k = 0;
        double[][] Array = new double[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                Array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (Array[i][j] > 0) {
                    k++;
                }
                System.out.print(Array[i][j]);
                System.out.print('\t');
            }
        }
        System.out.print('\n');
        System.out.print("Положительных элементов = " + k);
    }
}