package com.zavadski._2_Algorithmization;

public class task107 {
    /* Даны целые числа а1 ,а2 ,..., а2п.
       найти max(a1+a2n, ...).*/
    public static void main(String[] args) {
        int A[] = {10, 9, 8, 14, 5, 6, 7, 8, 9, 1};
        int max = A[0] + A[A.length - 1];
        for (int i = 1; i < (A.length - i); i++) {
            int a = (A[i] + A[A.length - i - 1]);
            if (a > max) {
                max = a;
            }
        }
        System.out.println(max);
    }
}
