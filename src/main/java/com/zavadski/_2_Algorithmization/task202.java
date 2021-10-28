package com.zavadski._2_Algorithmization;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class task202 {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 1}
        };
        int a = Array.length - 1;
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (i == j || i + j == a) {
                    System.out.print(Array[i][j] + " ");
                }
            }
        }
    }
}
