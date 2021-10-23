package com.zavadski._1_Basics_of_software_code_development;

// Вычислить значения функции на отрезке [а,b] c шагом h
public class task302 {
    public static void main(String[] args) {
        int a, b;
        double y, x, h;
        a = 0;
        b = 10;
        h = 1;
        for (x = a; x <= b; x += h) {
            System.out.print("x= " + x + ",");
            if (x > 2) {
                y = x;
                System.out.println("y =" + y);
            } else if (x <= 2) {
                y = -x;
                System.out.println("y =" + y);
            }
        }
    }
}