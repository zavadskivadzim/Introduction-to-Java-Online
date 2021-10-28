package com.zavadski._3_StringsAndBasicsOfTextProcessing;

// Дан текст (строка).
// Найдите наибольшее количество подряд идущих пробелов в нем.
public class task201 {
    public static void main(String[] args) {
        String st = "Helo    gnom      privet";
        int k = 0;
        int max = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ') {
                k = 1;
                while (st.charAt(i) == ' ' && st.charAt(++i) == ' ') {
                    k++;
                }
                max = (k < max) ? max : k;
            }
        }
        System.out.println("максимально пробелов подряд: " + max);
    }
}