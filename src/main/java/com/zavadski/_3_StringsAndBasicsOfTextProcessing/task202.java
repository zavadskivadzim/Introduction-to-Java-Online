package com.zavadski._3_StringsAndBasicsOfTextProcessing;

//В строке вставить после каждого символа 'a' символ 'b'.
public class task202 {
    public static void main(String[] args) {
        String st = "kra kraik";
        String st1 = st.replace("a", "ab");
        System.out.print(st1);
    }
}