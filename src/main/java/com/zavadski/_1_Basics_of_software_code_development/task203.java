package com.zavadski._1_Basics_of_software_code_development;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой
public class task203 {
    public static void main(String[] args) {
        int x1 = 1;
        int x2 = 2;
        int x3 = 3;
        int y1 = 1;
        int y2 = 3;
        int y3 = 5;
        if ((x1 - x2) * (y2 - y3) == (y1 - y2) * (x2 - x3)) {
            System.out.println("точки расположены на одной прямой");
        } else {
            System.out.println("точки не расположены на одной прямой");
        }
    }
}
