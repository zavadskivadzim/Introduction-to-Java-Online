package com.zavadski._3_StringsAndBasicsOfTextProcessing;

// в строке найти количество цифр
public class task103 {
    public static void main(String[] args) {
        String st = "Hello word! 123 word 45 is 6good 7";
        int kolCifr = 0;
        for (int i = 0; i < st.length(); i++) {
            if (Character.isDigit(st.charAt(i))) {
                kolCifr++;
            }
        }
        System.out.println(kolCifr);
    }
}