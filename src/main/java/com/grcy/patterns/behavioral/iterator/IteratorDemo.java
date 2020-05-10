package com.grcy.patterns.behavioral.iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Payment[] payments = {new Payment("Woda"), new Payment("Prąd"), new Payment("Gaz"), new Payment("Przedszkole")};
        PaymentList paymentList = new PaymentList(payments);
        MyIterator<Payment> paymentIterator = paymentList.iterator();
        System.out.println("Iterator demo:");
        while(paymentIterator.hasNext()) {
            Payment currentPayment = paymentIterator.next();
            System.out.println(currentPayment.getName());
        }
    }
}
