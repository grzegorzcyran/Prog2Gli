package com.grcy.patterns.structural.decorator;

public class TestDecorator {

    Item item1 = new BasicItem();

    Item item2 = new SpecialItem1(new BasicItem(), true);

    Item item3 = new SpecialItem1(new SpecialItem2(new BasicItem()), false);
}
