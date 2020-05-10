package com.grcy.patterns.behavioral.chainOfResponsibility;

public class ChainTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Jan Kowalski", 10);
        employees.addEmployee("Marian Nowak", 5);
        employees.addEmployee("Maria Rajska", 12);

        AccessCheck accessCheck = new CompanyInsiderCheck();
        accessCheck.addChainElement(new EmployeeSeniorityCheck());

        XCompany company = new XCompany();
        company.setCheck(accessCheck);

        System.out.println("Not an employee");
        company.enterRoom("Jan Okoń");
        System.out.println("Employee 1");
        company.enterRoom("Marian Nowak");
        System.out.println("Employee 2");
        company.enterRoom("Maria Rajska");


    }
}
