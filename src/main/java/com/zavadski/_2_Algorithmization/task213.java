package com.zavadski._2_Algorithmization;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class task213 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 3, 2, 4},
                {2, 0, 8, 0},
                {3, 0, 4, 5},
                {4, 7, 1, 1}
        };
        for (int i = 1; i < array.length; i++) {
            int forSort;
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] > array[i - 1][k]) {
                    forSort = array[i][k];
                    array[i][k] = array[i - 1][k];
                    array[i - 1][k] = forSort;
                }
                for (int j = 1; j < array.length; j++) {
                    for (int l = 0; l < array[j].length; l++) {
                        if (array[j][l] > array[j - 1][l]) {
                            forSort = array[j][l];
                            array[j][l] = array[j - 1][l];
                            array[j - 1][l] = forSort;
                        }
                    }
                }
            }
        }
        System.out.println("Сортировка по убыванию:");
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        for (int i = 1; i < array.length; i++) {
            int forSort;
            for (int k = 0; k < array[i].length; k++) {
                if (array[i][k] < array[i - 1][k]) {
                    forSort = array[i][k];
                    array[i][k] = array[i - 1][k];
                    array[i - 1][k] = forSort;
                }
                for (int j = 1; j < array.length; j++) {
                    for (int l = 0; l < array[j].length; l++) {
                        if (array[j][l] < array[j - 1][l]) {
                            forSort = array[j][l];
                            array[j][l] = array[j - 1][l];
                            array[j - 1][l] = forSort;
                        }
                    }
                }
            }
        }
        System.out.println("Сортировка по возрастанию:");
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
