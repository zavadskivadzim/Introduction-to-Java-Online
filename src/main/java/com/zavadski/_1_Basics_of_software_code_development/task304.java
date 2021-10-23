package com.zavadski._1_Basics_of_software_code_development;

import java.math.BigInteger;

// Составить программу нахождения произведения квадратов первых двухсот чисел
public class task304 {
    public static void main(String[] args) {
        BigInteger summ = new BigInteger("0");
        BigInteger res = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            summ = summ.add(BigInteger.valueOf(i));
            res = res.multiply(summ.pow(2));
        }
        System.out.println(res);
    }
}