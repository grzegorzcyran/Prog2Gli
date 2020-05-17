package com.grcy.patterns.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new AllegroMediator();

        Customer customer1 = new AllegroCustomer(mediator, "Jasiu c1");
        Customer customer2 = new AllegroCustomer(mediator, "Wiesiu c2");
        Customer customer3 = new AllegroCustomer(mediator, "Stasiu c3");
        Customer customer4 = new AllegroCustomer(mediator, "Rysiu c4");

        mediator.addBuyer(customer1);
        mediator.addBuyer(customer2);
        mediator.addBuyer(customer3);

        customer1.bid(100);
        customer2.bid(200);
        customer3.bid(150);
        System.out.println("Start auction");
        mediator.findTopBidder();

        customer2.cancelBid();
        mediator.findTopBidder();

        mediator.addBuyer(customer4);
        customer4.bid(2000);

        mediator.findTopBidder();

    }
}
