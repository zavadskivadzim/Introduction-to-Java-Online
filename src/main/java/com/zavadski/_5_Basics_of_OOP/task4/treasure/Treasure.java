package com.zavadski._5_Basics_of_OOP.task4.treasure;

public class Treasure {
    private TreasureType type;
    private String name;
    private double cost;

    public Treasure(TreasureType type, String name, double cost) {
        this.type = type;
        this.name = name;
        this.cost = cost;
    }

    public TreasureType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "treasureType=" + type +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
