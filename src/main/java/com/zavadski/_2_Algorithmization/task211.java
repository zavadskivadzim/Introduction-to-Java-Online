package com.zavadski._2_Algorithmization;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.
public class task211 {
    public static void main(String[] args) {
        int[][] Array = new int[10][20];
        int sum = 0;
        int indexRow = 0;
        int kolFive = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = (int) (Math.random() * 16);
                sum += Array[i][j];
                System.out.print(Array[i][j] + "\t" + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Сумма всех элементов: " + sum);
        System.out.print("Число 5 встречается больше 2 раз в строках: ");
        for (int i = 0; i < Array.length; i++) {
            int n = 0;
            for (int j = 0; j < Array[i].length; j++) {
                if (Array[i][j] == 5) {
                    n++;
                }
            }
            if (n > 2) {
                System.out.print(i + " ");
            }
        }
    }
}
