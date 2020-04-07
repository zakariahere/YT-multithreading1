package tech.elzakaria.multiraceCondition2;

<<<<<<< HEAD

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CounterRun implements Runnable {
    public static int counter = 0;

    public synchronized void increment() {
         counter++;
        log.info(counter + " ");
    }


    @Override
    public void run() {
        increment();
=======
public class CounterRun implements Runnable {
    @Override
    public void run() {
        MultiRaceCondition2.Wrapper.counter++;
        MultiRaceCondition2.Wrapper.counter++;
        MultiRaceCondition2.Wrapper.counter++;

>>>>>>> 7b3c3a864afd180a003d27c93271ac9a61849262
    }
}

