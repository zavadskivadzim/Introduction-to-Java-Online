package com.zavadski._1_Basics_of_software_code_development;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения)
// (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦
public class task103 {
    public static void main(String[] args) {
        double x = 7.2;
        double y = 4.6;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) + Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}
