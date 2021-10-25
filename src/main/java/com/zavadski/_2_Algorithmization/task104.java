package com.zavadski._2_Algorithmization;

public class task104 {
    /*Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы. */
    public static void main (String[] args) {
        int A[] = {4, 5, 6, 7, 10, 3, 2, 1, 8, 9};
        int i=0, min=100, max=0,  maxInd=0,  minInd=0;
            for (i = 0; i < A.length; i++) {
        if (A[i]>max) {
            max=A[i];
            maxInd=i; }
        if (A[i]<min) {
            min=A[i];
            minInd=i; };
            }
        System.out.println("Максимальный элемент: " + max + ". В очередности: " + maxInd );
        System.out.println("Максимальный элемент: " + min + ". В очередности: " + minInd );
        A[maxInd] = min;
        A[minInd]=max;
        for (i = 0; i < A.length; i++) {
            System.out.print(A[i] + " " );
        }
    }
}