package com.grcy.threads.basics;

import static com.grcy.threads.ThreadColor.ANSI_RED;

public class RunnableSampleThread implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Runnable sample thread working");

    }
}
