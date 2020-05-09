package com.grcy.patterns.structural.flyweight;

import java.util.HashSet;
import java.util.Set;

public class MustangBaseFactory {
    private static Set<FordMustangBase> fordMustangBaseSet = new HashSet<>();

    public static FordMustangBase getMustangBase(String color, String equipment) {
        FordMustangBase fordMustangBase;
        System.out.println(MustangBaseFactory.class + " getMustangBase");
        if(fordMustangBaseSet.size() > 0) {
            System.out.println("Size > 1");
            fordMustangBase = fordMustangBaseSet.stream()
                    .filter(f -> color.equals(f.getColor()) && equipment.equals(f.getEquipment()))
                    .peek(s -> {System.out.println("peek" + s.getColor());})
                    .findAny()
                    .orElseGet(() -> getNew(color, equipment));
        } else {
            System.out.println("Size = 0");
            fordMustangBase = new FordMustangBase(color, equipment);
        }
        fordMustangBaseSet.add(fordMustangBase);
        return fordMustangBase;
    }
    private static FordMustangBase getNew(String color, String equipment){
        System.out.println("OrElse");
        return new FordMustangBase(color, equipment);
    }
}
