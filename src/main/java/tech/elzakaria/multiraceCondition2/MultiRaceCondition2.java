package tech.elzakaria.multiraceCondition2;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiRaceCondition2 {


    public static void main(String[] args) {
        Thread t1, t2, t3;


        CounterRun counterRun = new CounterRun();
        t1 = new Thread(counterRun);
        t2 = new Thread(counterRun);
        t3 = new Thread(counterRun);

        log.info(Wrapper.counter + " is the final value");
    }
}
