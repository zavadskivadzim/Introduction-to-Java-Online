package com.zavadski._2_Algorithmization;

public class task106 {
    /*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.*/
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 1; i < (A.length - 1); i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j != 0) {
                    sum += A[i];
                }
            }
        }
        System.out.println(sum);
    }
}
