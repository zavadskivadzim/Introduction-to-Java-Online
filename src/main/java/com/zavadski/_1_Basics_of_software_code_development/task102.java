package com.zavadski._1_Basics_of_software_code_development;

public class task102 {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 5;
        double z = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("z=" + z);
    }
}
