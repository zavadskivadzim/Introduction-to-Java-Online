package com.zavadski._3_StringsAndBasicsOfTextProcessing;

import java.util.Scanner;

//Вводится строка. Требуется удалить из нее повторяющиеся символы
// и все пробелы. Например, если было введено "abc cde def",
// то должно быть выведено "abcdef".
public class task207 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String st = scanner.nextLine();
        StringBuilder stb = new StringBuilder(st);
        for (int i = 0; i < stb.length(); i++) {
            for (int j = i + 1; j < stb.length(); j++) {
                if (stb.charAt(i) == ' ') {
                    stb.deleteCharAt(i);
                }
                if (stb.charAt(i) == stb.charAt(j)) {
                    stb.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println(stb);
    }
}