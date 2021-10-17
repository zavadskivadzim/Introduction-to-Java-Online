package com.zavadski._1_Basics_of_software_code_development;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие
public class task204 {
    public static void main(String[] args) {
        int A = 65;
        int B = 120;
        int x = 250;
        int y = 120;
        int z = 65;
        if (((x <= A) && (y <= B)) || ((x <= B) && (y <= A))) {
            System.out.println("да");
        } else if
        (((x <= A) && (z <= B)) || ((x <= B) && (z <= A))) {
            System.out.println("да");
        } else if
        (((y <= A) && (z <= B)) || ((y <= B) && (z <= A))) {
            System.out.println("да");
        } else {
            System.out.println("нет");
        }
    }
}
