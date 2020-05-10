package com.grcy.patterns.behavioral.chainOfResponsibility;

public class CompanyInsiderCheck extends AccessCheck {

    @Override
    public boolean doCheck(String username) {

        System.out.println("CompanyInsiderCheck start for " + username);
        if(!Employees.checkEmployee(username)){
            System.out.println(getClass().getCanonicalName() + " do_Check FAILED");
            return false;
        }
        System.out.println(getClass().getCanonicalName() + " do_Check PASSED");
        return checkNextElement(username);
    }
}
