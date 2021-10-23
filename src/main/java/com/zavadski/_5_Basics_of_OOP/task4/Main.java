package com.zavadski._5_Basics_of_OOP.task4;


import com.zavadski._5_Basics_of_OOP.task4.DragonCave;

import java.util.Scanner;

/*
Задача 4.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.
Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму
*/

public class Main {
    public static void main(String[] args) {
        DragonCave dragon = new DragonCave();
        int menuItem = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Просмотр сокровищ \n" +
                    "2. Выбрать самое дорогое по стоимости сокровище \n" +
                    "3. Выбрать сокровище на заданную сумму \n" +
                    "0. Отмена");
            System.out.println("Сделайте ваш выбор: ");
            menuItem = scanner.nextInt();
            switch (menuItem) {
                case (1):
                    dragon.showTreasure();
                    break;
                case (2):
                    dragon.greatestTreasure();
                    break;
                case (3):
                    System.out.println("Введите сумму: ");
                    Scanner scannerSumm = new Scanner(System.in);
                    double summ = scannerSumm.nextDouble();
                    dragon.chooseTreasuresAmount(summ);
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }


        } while (menuItem != 0);
        dragon.greatestTreasure();

    }
}
