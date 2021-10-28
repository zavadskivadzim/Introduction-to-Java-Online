package com.zavadski._3_StringsAndBasicsOfTextProcessing;

// Строка X состоит из нескольких предложений, каждое из которых
// кончается точкой, восклицательным или вопросительным знаком.
// Определить количество предложений в строке X.
public class task210 {
    public static void main(String[] args) {
        String st = "Hello World. I am here! Where are you from?";
        int n = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '.' || st.charAt(i) == '!' || st.charAt(i) == '?')
                n++;
        }
        System.out.println("В строке " + n + " предложений");
    }
}
