package com.zavadski._3_StringsAndBasicsOfTextProcessing;

//C помощью функции копирования и операции конкатенации
// составить из частей слова “информатика” слово “торт”.
public class task204 {
    public static void main(String[] args) {
        String st = "информатика";
        String st1 = st.substring(7, 8) + st.substring(3, 5) + st.substring(7, 8);
        System.out.println(st);
        System.out.println(st1);
    }
}