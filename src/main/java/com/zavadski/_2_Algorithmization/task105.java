package com.zavadski._2_Algorithmization;

public class task105 {
    /*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i. */
    public static void main(String[] args) {
        int A[] = {10, 9, 8, 2, 6, 3, 2, 1, 8, 9};
        int i = 0;
        for (i = 0; i < A.length; i++) {
            if (A[i] > i) {
                System.out.println(A[i]);
            } else {
                System.out.println("выброшено " + A[i]);
            }
        }
    }
}