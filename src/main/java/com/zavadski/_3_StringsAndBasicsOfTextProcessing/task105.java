package com.zavadski._3_StringsAndBasicsOfTextProcessing;

// Удалить в строке все лишние пробелы, то есть серии
// подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.
public class task105 {
    public static void main(String[] args) {
        String st = "  Hello    word!     word is good ";
        while (st.contains("  ")) {
            String st1 = st.replace("  ", " ");
            st = st1;
        }
        st = st.trim();
        System.out.println(st);
    }
}