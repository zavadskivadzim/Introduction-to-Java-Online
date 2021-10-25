package com.zavadski._2_Algorithmization;

import java.util.Arrays;

public class task108 {
    /* Дана последовательность целых чисел a1 a2 ... an. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min(a1 a2 ... an). */
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 1, 6, 1, 7};
        System.out.println(Arrays.toString(deleteMinValue(array)));
    }

    public static int[] deleteMinValue(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив нулевой длины!");
        }
        int minCount = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        //for (int value = 0; value < array.length; value++) {               - это немного не подходит
        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }
        int[] result = new int[array.length - minCount];
        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        return result;
    }
}