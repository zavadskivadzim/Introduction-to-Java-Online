package com.zavadski._2_Algorithmization;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class task110 {
    public static void main(String[] args) {
        int A[] = {1, 3, 3, 4, 5, 6};
        for (int i = 0; i < A.length; i++) {
            if ((i + 1) % 2 == 0) {
                A[i] = 0;
            }
        }
        for (int i = 0; i < A.length; i++)
            System.out.print(A[i] + " ");
    }
}
