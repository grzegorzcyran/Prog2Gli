package com.grcy.patterns.structural.flyweight;

class FordMustangBase {
    private String color;
    private String equipment;

    public FordMustangBase(String color, String equipment) {
        System.out.println(this.getClass() + " constructor + " + color + " " + equipment);
        this.color = color;
        this.equipment = equipment;
    }

    public String getColor() {
        return color;
    }

    public String getEquipment() {
        return equipment;
    }

}
