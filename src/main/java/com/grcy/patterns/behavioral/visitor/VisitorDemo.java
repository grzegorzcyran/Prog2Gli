package com.grcy.patterns.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Item1(20, 5, "TV"),
                new Item1(100, 2, "Laptop"),
                new Item2(5, 1, "banany")
        };

        int total = 0;
        ItemVisitor visitor = new ItemVisitorClass();
        for(ItemElement element : items) {
            total += element.accept(visitor);
        }
        System.out.println("Total cost : " + total);
    }
}
