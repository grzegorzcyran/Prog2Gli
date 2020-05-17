package com.grcy.threads.basics;

import static com.grcy.threads.ThreadColor.ANSI_BLUE;

public class OtherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Running thread with name :" + currentThread().getName());

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + " Somebody woke me up");
            return;
        }
        System.out.println(ANSI_BLUE + "Sleeped enough, back to work!");

    }
}
