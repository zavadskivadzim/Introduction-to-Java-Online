package com.zavadski._1_Basics_of_software_code_development;

// Найти max{min(a, b), min(c, d)}.
public class task202 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 14;
        b = 5;
        c = 7;
        d = 10;
        int min1;
        int min2;
        int max;
        if (a < b)
            min1 = a;
        else
            min1 = b;
        min2 = (c < d) ? c : d;
        max = min1 > min2 ? min1 : min2;
        System.out.println(max);
    }
}
