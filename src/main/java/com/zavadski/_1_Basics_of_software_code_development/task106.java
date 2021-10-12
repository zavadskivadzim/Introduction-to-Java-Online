package com.zavadski._1_Basics_of_software_code_development;

// Для данной области составить линейную программу, которая печатает true,сли точка с координатами (х, у)
// принадлежит закрашенной области, и false — в противном случае:
public class task106 {
    public static void main(String[] args) {
        int x = 2;
        int y = 2;
        boolean z = (x >= -4) && (x <= 4) && (y >= -3) &&
                (y <= 0) || (x >= -2) && (x <= 2) && (y >= 0) && (y <= 4);
        System.out.println(z);
    }
}
