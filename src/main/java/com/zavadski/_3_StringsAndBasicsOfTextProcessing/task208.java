package com.zavadski._3_StringsAndBasicsOfTextProcessing;

import java.util.Scanner;

// Вводится строка слов, разделенных пробелами.
// Найти самое длинное слово и вывести его на экран.
// Случай, когда самых длинных слов может быть несколько, не обрабатывать.
public class task208 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String st = scanner.nextLine();

        int max = 0;
        String stMax;
        String[] subStr;
        subStr = st.split(" "); // Разделения строки str с помощью метода split()
        for (int i = 0; i < subStr.length; i++) {
            max = (subStr[i].length() > max ? subStr[i].length() : max);
        }
        for (int i = 0; i < subStr.length; i++) {
            if (subStr[i].length() == max) {
                stMax = subStr[i];
                System.out.println("Самое длинное слово \"" + stMax +
                        "\". Состоит из " + max + " букв");
            }

        }
    }
}
