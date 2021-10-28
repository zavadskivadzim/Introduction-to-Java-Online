package com.zavadski._3_StringsAndBasicsOfTextProcessing;

//Подсчитать, сколько раз среди символов заданной строки
// встречается буква “а”.
public class task205 {
    public static void main(String[] args) {
        String st = "информатика";
        int n = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'а') {
                n++;
            }
        }
        System.out.println("Символ 'a' встречается " + n + " раз");
    }
}