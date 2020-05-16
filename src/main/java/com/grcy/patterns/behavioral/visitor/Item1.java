package com.grcy.patterns.behavioral.visitor;

public class Item1 implements ItemElement {

    private int commonValue;
    private int itemValue;
    private String name;

    public Item1(int commonValue, int itemValue, String name) {
        this.commonValue = commonValue;
        this.itemValue = itemValue;
        this.name = name;
    }

    public int getCommonValue() {
        return commonValue;
    }

    public int getItemValue() {
        return itemValue;
    }

    public String getName() {
        return name;
    }

    @Override
    public int accept(ItemVisitor visitor) {
        return visitor.visit(this);
    }
}
