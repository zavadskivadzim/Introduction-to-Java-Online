package com.zavadski._5_Basics_of_OOP.task4;

import com.zavadski._5_Basics_of_OOP.task4.treasure.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DragonCave {
    private Treasure treasure;
    private List<Treasure> treasureList;

    public DragonCave() {
        GeneratorTreasures generatorTreasures = new GeneratorTreasures();
        treasureList = new ArrayList<>();
        generatorTreasures.generateTreasure();
    }

    class GeneratorTreasures {
        void generateTreasure() {
            Random random = new Random();
            for (int i = 1; i <= 100; i++) {
                String name = "Сокровище " + i;
                treasureList.add(new Treasure(randomEnum(TreasureType.class), name, random.nextInt(100)));
            }
        }
    }

    private <T extends Enum<?>> T randomEnum(Class<T> T) {
        Random random = new Random();
        int x = random.nextInt(T.getEnumConstants().length);
        return T.getEnumConstants()[x];
    }

    public void showTreasure() {
        treasureList.forEach(System.out::println);
    }

    public void greatestTreasure() {
        double highPrice = 0;
        for (Treasure treas : treasureList) {
            highPrice = highPrice < treas.getCost()?treas.getCost():highPrice;
        }
        for (Treasure treas : treasureList) {
            if (highPrice == treas.getCost()) {
                System.out.println(treas);
            }
        }
    }

    public void chooseTreasuresAmount(Double summ) {
        List<Treasure> treas = new ArrayList<>();
        treasureList.stream().sorted((x, y) -> (int) y.getCost() - (int) x.getCost());
        for (Treasure tr : treasureList) {
            if (tr.getCost() <= summ) {
                treas.add(tr);
            }
        }
        treas.stream().forEach(System.out::println);
    }
}
