package com.zavadski._1_Basics_of_software_code_development;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
// модуль которых больше или равен заданному е. Общий член ряда имеет вид
public class task305 {
    public static void main(String[] args) {
        int i = 1;
        double e = 0.01, a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        double sum = 0;
        while (a >= e) {
            sum += a;
            ++i;
            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
        }
        System.out.println(sum);
    }
}