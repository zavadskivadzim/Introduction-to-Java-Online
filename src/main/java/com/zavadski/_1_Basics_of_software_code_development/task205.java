package com.zavadski._1_Basics_of_software_code_development;

// Вычислить значение функции
public class task205 {
    public static void main(String[] args) {
        double x = 2;
        double Fx = x <= 3 ? (Math.pow(x, 2) - 3 * x + 9) : (1 / (Math.pow(x, 3) + 6));
        System.out.println(Fx);
    }
}
