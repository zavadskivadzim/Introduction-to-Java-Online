package com.zavadski._2_Algorithmization;
//В числовой матрице поменять местами два любых столбца,
// т. е. все элементы одного столбца поставитьна соответствующие
// им позиции другого, а его элементы второго переместить в первый.
// Номера столбцов вводит пользователь с клавиатуры.

import java.util.Scanner;

public class task208 {
    public static void main(String[] args) {
        int[][] Array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {9, 8, 7, 6, 1}
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер первого столбца: ");
        int num1 = in.nextInt();
        System.out.println("Введите номер второго столбца: ");
        int num2 = in.nextInt();
        System.out.println("Меняем столбцы " + num1 + " и " + num2);
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                if (j == num1) {
                    int num3 = Array[i][j];
                    Array[i][j] = Array[i][num2];
                    Array[i][num2] = num3;
                    break;
                }
            }
        }
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j]);
                System.out.print('\t');
            }
            System.out.print('\n');
        }
    }
}
