package com.zavadski._3_StringsAndBasicsOfTextProcessing;

// Дан массив названий переменных в camelCase.
// Преобразовать названия в snake_case.
public class task101 {
    public static void main(String[] args) {
        String[] array = {"Int", "Char", "Long"};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toLowerCase();
        }

        for (String a : array) {
            System.out.print(a + " ");
        }
    }
}
