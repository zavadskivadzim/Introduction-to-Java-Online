package com.zavadski._1_Basics_of_software_code_development;

//Вывести на экран соответствий между символами
//и их численными обозначениями в памяти компьютера
public class task306 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 40; i <= n; i++) {
            System.out.println(i + " - " + (char) i);
        }
    }
}