package com.zavadski._2_Algorithmization;

public class task109 {
    /* В массиве целых чисел с количеством n найти наиболее часто встречающееся число.
     если этих чисел несколько, то найти наименьшее из них */
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 2, 3, -1, 2, 2, 2, 3, 3, 3, 1, 1, 1, 1};
        int minValue = array[0];
        int repeat = 0;
        for (int i = 0; i < array.length; i++) {
            int k = array[0];
            minValue = (array[i] > k) ? array[i] : k;
        }
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++)
                if (array[i] == array[j])
                    count++;
            if (count >= repeat) {
                repeat = count;
                minValue = (array[i] < minValue) ? array[i] : minValue;
            }
        }
        System.out.println("Максимальное количество повторов: " + repeat);
        System.out.println("Минимальное число, имеющее " + repeat + " повторов: " + minValue);
    }
}
