package com.zavadski._2_Algorithmization;

public class task103 {
    /*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов. */
    public static void main(String[] args) {
        int A[] = {-3, -2, -1, 0, 1, 2, 3, 4, 5, 6};
        int i = 0;
        int x = 0, y = 0, z = 0;
        for (i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                x++;
            } else if (A[i] < 0) {
                y++;
            } else {
                z++;
            }
        }
        System.out.println("Массив имеет " + x + " положительных элементов");
        System.out.println("Массив имеет " + y + " отрицательных элементов");
        System.out.println("Массив имеет " + z + " нулевых элементов");
    }
}
