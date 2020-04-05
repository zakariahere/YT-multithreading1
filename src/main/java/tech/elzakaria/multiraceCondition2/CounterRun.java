package tech.elzakaria.multiraceCondition2;

public class CounterRun implements Runnable {
    @Override
    public void run() {
        MultiRaceCondition2.Wrapper.counter++;
        MultiRaceCondition2.Wrapper.counter++;
        MultiRaceCondition2.Wrapper.counter++;

    }
}

