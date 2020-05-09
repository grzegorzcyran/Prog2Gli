package com.grcy.patterns.creational.singleton;

public class Test {

    public static void main(String[] args) {

        EagerSingleton.getInstance();

        EagerSingleton.getInstance();


        LazySingleton.getInstance();
        LazySingleton.getInstance();


        System.out.println(EagerSingleton.getInstance().getSth());
    }
}
