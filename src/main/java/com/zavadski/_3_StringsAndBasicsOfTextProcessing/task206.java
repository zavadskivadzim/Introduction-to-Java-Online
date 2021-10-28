package com.zavadski._3_StringsAndBasicsOfTextProcessing;

//Из заданной строки получить новую, повторив каждый символ дважды.
public class task206 {
    public static void main(String[] args) {
        String st = "мир прекрасен";
        StringBuilder stb = new StringBuilder(st.length() * 2);
        for (int i = 0; i < st.length(); i++) {
            stb.append(st.charAt(i)).append(st.charAt(i));
        }
        String st1 = stb.toString();
        System.out.println(st1);
    }
}