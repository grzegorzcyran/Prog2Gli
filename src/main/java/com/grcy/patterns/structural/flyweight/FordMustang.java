package com.grcy.patterns.structural.flyweight;

public class FordMustang {
    private FordMustangBase mustangBase;
    private String radio;

    public FordMustang(String color, String equipment, String radio) {
        System.out.println(this.getClass() + " constructor");
        this.mustangBase = MustangBaseFactory.getMustangBase(color, equipment);
        this.radio = radio;
    }
}
