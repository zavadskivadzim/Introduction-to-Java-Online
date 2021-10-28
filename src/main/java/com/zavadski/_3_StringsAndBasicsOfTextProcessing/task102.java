package com.zavadski._3_StringsAndBasicsOfTextProcessing;

//Замените в строке все вхождения 'word' на 'letter'.
public class task102 {
    public static void main(String[] args) {
        String st = "Hello word! word is good";
        String st1 = st.replace("word", "letter");
        System.out.println(st1);
    }
}
