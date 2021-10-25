package com.zavadski._2_Algorithmization;
// В массив A [N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному К.
public class task101 {

    public static void main(String[] args) {
        int array[] = new int[]{5, 6, 7, 8, 9, 10, 11, 12};
        int k = 3;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
