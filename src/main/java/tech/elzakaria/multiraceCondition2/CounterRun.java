package tech.elzakaria.multiraceCondition2;


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
    }
}

