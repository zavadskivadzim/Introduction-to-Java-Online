package com.zavadski._1_Basics_of_software_code_development;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class task104 {
    public static void main(String[] args) {
        double x = 431.172;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
    }
}
