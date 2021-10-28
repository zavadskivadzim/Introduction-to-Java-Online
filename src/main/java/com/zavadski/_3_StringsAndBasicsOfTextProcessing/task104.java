package com.zavadski._3_StringsAndBasicsOfTextProcessing;

// в строке найти количество чисел
public class task104 {
    public static void main(String[] args) {
        String st = "Hello word! 123 word 45 is good 35";
        int kolCifr = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                if (i < (st.length() - 1) && (Character.isDigit(st.charAt(i + 1)))) {
                    continue;
                }
                kolCifr++;
            }
        }
        System.out.println(kolCifr);
    }
}