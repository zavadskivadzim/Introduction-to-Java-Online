package com.zavadski._4_Programming_with_classes.task2;

//Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
//конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
//класса.

public class Test2 {
    private int firstValue;
    private int secondValue;

    public Test2() {
    }

    public Test2(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
}
