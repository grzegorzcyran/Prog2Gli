package com.grcy.threads.basics;

import static com.grcy.threads.ThreadColor.*;

public class MainThread {

    /**
     * Nie ma gwarancji który wątek będzie kiedy wykonywany, działają niezależnie od siebie i tak też mogą logować do konsoli
     * Nie możemy oczekiwać że logi w konsoli będą "z góry na dół" zgodnie z kolejnością wywołań
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + " Main thread in action");

        Thread otherThread = new OtherThread();
        otherThread.setName("===== OTHER THREAD =====");
        otherThread.start(); //startuje nowy wątek i wykonuje to co jest w run() w nowym wątku
        //otherThread.run(); //wykonuje to co jest w run w OtherThread ale nie generuje nowego wątku

        Thread runnableSample = new Thread(new RunnableSampleThread());
        runnableSample.start();

        System.out.println(ANSI_PURPLE + "End of main");

        //otherThread.interrupt(); //wywoła przerwanie sleepa na wątku

        //w przypadku gdy mamy niewielki task i nie ma sensu pisać do niego osobnej dedykowanej klasy
        // ale chcemy go zrobić w osobnym wątku robimy klasę anonimową
        new Thread() {
            @Override
            public void run() {
                System.out.println(ANSI_CYAN+" Anonymous class thread!");
            }
        }.start();

        //nadpisanie klasy na potrzebę pojedynczej akcji
        runnableSample = new Thread(new RunnableSampleThread() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "overridden RunnableSampleThread");
                //przykład na łączenie dwóch wątków, gdzie jeden czeka na zakończenie działania drugiego
                try {
                    otherThread.join();
                    System.out.println(ANSI_RED + " other thread finished so I continue");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "overridden Runnable terminated");
                }
            }
        });
        runnableSample.start();
    }
}
