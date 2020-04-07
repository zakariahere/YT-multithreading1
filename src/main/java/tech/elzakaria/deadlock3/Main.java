package tech.elzakaria.deadlock3;

import tech.elzakaria.multiraceCondition2.CounterRun;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        RunnableCounter counterRun = new RunnableCounter();
        Thread t1 = new Thread(counterRun);
        Thread t2 = new Thread(counterRun);
        System.out.println("Lancement des threads");

        t1.start();
        t2.start();


        System.out.println("en cours");

        t1.join();
        t2.join();

        System.out.println("fin du prog.");

    }
}
