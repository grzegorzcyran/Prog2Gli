package com.grcy.patterns.behavioral.templateMethod;

public class EmailNewsProvider extends NewsProvider {
    String email;
    
    @Override
    public boolean authorize() {
        System.out.println("Create connetion"); return false;
    }

    @Override
    public boolean endConnection() {
        System.out.println("Close connection"); return false;
    }
}
