package com.zavadski._2_Algorithmization;

/* Дана последовательность действительных чисел а1 ,а2 ,..., ап.
   Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.*/
public class task102 {

    public static void main(String[] args) {
        int A[] = {10, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int Z = 7;
        int i = 0;
        int n = 0;
        for (i = 0; i < A.length; i++) {
            if (A[i] > Z) {
                A[i] = Z;
                n++;
            }
            System.out.println(A[i]);
        }
        System.out.println("Количество замен: " + n);
    }
}