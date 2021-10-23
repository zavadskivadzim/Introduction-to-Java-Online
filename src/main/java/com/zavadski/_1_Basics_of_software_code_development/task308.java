package com.zavadski._1_Basics_of_software_code_development;

//Даны два числа. Определить цифры, входящие в запись
//как первого так и второго числа.
public class task308 {
    public static void main(String[] args) {
        int a = 34835743;
        int a1;
        int b1;
        int h = 0;
        int[] arr = new int[20];
        int k = 0;

        OUTER:
        while (a > 0) {
            int b = 495577053;
            a1 = a % 10;
            INNER:
            while (b > 0) {
                b1 = b % 10;
                if (a1 == b1) {
                    k++;
                    arr[k] = a1;
                    System.out.println("Совпадение " + a1);
                }
                b /= 10;
            }
            a /= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }
}