package com.zavadski._3_StringsAndBasicsOfTextProcessing;

import java.util.Scanner;

// Посчитать количество строчных (маленьких) и прописных (больших)
// букв в введенной строке. Учитывать только английские буквы.
public class task209 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String st = scanner.nextLine();

        int n = 0;
        int k = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
                n++;
            if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')
                k++;
        }
        System.out.println("Прописных букв: " + n);
        System.out.println("Строчных букв: " + k);
    }
}
