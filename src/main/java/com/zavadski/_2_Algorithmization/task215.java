package com.zavadski._2_Algorithmization;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class task215 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 2, 4},
                {2, 0, 8, 0},
                {3, 0, 4, 5},
                {4, 7, 1, 1}
        };
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                max = (array[i][k] > max) ? array[i][k] : max;
            }
        }
        System.out.println("Максимальное значение:" + max);
        for (int i = 0; i < array.length; i++) {
            for (int k = 1; k < array[i].length; k += 2) {
                array[i][k] = max;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + "\t");
            }
            System.out.println();
        }
    }
}
