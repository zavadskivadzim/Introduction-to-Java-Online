package com.zavadski._1_Basics_of_software_code_development;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
// и если да, то будет ли он прямоугольным
public class task201 {
    public static void main(String[] args) {
        int a = 170;
        int b = 62;
        if (a + b < 180)
            System.out.print("треугольник существует");
        else
            System.out.print("такого треугольника не существует");
        if (a + b < 180 && (a == 90 || b == 90 || (a + b == 90)))
            System.out.println(" и является прямоугольным");
        else if (a + b < 180)
            System.out.println(", но не является прямоугольным");
    }
}