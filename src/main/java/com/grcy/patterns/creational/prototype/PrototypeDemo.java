package com.grcy.patterns.creational.prototype;

import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {

        //szablon
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.loadData();

        //Rzeczywista lista zakupowa
        try {
            ShoppingList zakupy1 = (ShoppingList) shoppingList.clone();

            List<String> listaZakupow = zakupy1.getShoppingList();
            listaZakupow.add("proszek do prania");
            listaZakupow.remove("chleb");

            listaZakupow.forEach(System.out::println);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
