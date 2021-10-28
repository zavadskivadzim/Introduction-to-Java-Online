package com.zavadski._3_StringsAndBasicsOfTextProcessing;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

//Проверить, является ли заданное слово палиндромом.
public class task203 {
    public static void main(String[] args) {
        String st = "goror1og";
        List<Character> list = new LinkedList<>();
        for (char ch : st.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("slovo polindrom");
        } else {
            System.out.println("slovo ne polindrom");
        }

// второй способ

        boolean isPalindrom = false;
        for (int i = 0; i < st.length() / 2; i++) {
            if ((st.charAt(i)) == (st.charAt(st.length() - 1 - i))) {
                isPalindrom = true;
            } else {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom == true) {
            System.out.println("slovo polindrom");
        } else {
            System.out.println("slovo ne polindrom");
        }
    }
}