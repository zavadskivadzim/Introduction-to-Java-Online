package com.zavadski._1_Basics_of_software_code_development;

// Дано натуральное число Т, которое представляет длительность прошедшеговремени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
public class task105 {
    public static void main(String[] args) {
        int T = 126852;
        int HH = T / 3600;
        int MM = (T - HH * 3600) / 60;
        int SS = T % 60;
        System.out.println(HH + "ч " + MM + "м " + SS + "с");
    }
}
