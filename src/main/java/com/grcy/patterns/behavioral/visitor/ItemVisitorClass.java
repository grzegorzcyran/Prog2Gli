package com.grcy.patterns.behavioral.visitor;

public class ItemVisitorClass implements ItemVisitor{

    @Override
    public int visit(Item1 item1) {
        int cost = 0;
        if(item1.getCommonValue() > 50) {
            System.out.println(item1.getName() + " discount added.");
            cost = item1.getCommonValue() - 5;
        } else {
            cost = item1.getCommonValue();
        }
        System.out.println("Final cost for " + item1.getName() + " = " + cost);
        return cost;
    }

    @Override
    public int visit(Item2 item2) {
        int cost = item2.getCommonValue();
        System.out.println("Final cost for " + item2.getName() + " = " + cost);
        return cost;
    }
}
