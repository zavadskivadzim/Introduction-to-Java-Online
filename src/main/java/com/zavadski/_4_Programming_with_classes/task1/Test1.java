package com.zavadski._4_Programming_with_classes.task1;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Test1 {
    int firstValue = 10;
    int secondValue = 20;

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.showValues();
        test1.setValues(5, 8);
        test1.showValues();
        System.out.println(test1.getSumm());
        System.out.println(test1.getMaxValues());
    }

    void showValues() {
        System.out.println("Значение первой переменной: " + firstValue);
        System.out.println("Значение второй переменной: " + secondValue);
    }

    void setValues(int firstValue, int secondValue) {
        System.out.println("После изменения значений переменных:");
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    int getSumm() {
        System.out.print("Сумма значений переменных: ");
        return firstValue + secondValue;
    }

    int getMaxValues() {
        System.out.print("Максимальное значение: ");
        return Math.max(firstValue, secondValue);
    }
}
