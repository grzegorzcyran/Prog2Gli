package com.grcy.patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AllegroMediator implements Mediator {

    private ArrayList<Customer> customers;

    public AllegroMediator() {
        this.customers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.name + " was added to bid list");

    }

    @Override
    public void findTopBidder() {
        int maxBid = 0;
        Customer currentWinner = null;

//        for (Customer customer : customers) {
//            if(customer.price > maxBid) {
//                maxBid = customer.price;
//                currentWinner = customer;
//            }
//        }

        currentWinner = Collections.max(customers, Comparator.comparing(c -> c.price));
        maxBid = currentWinner.price;

        System.out.println("Auction best price is placed by " + currentWinner.name
         + " with offer=" + maxBid);
    }
}
