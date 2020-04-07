package tech.elzakaria.multiraceCondition2;


import lombok.extern.slf4j.Slf4j;

<<<<<<< HEAD
import java.util.stream.Stream;

=======
>>>>>>> 7b3c3a864afd180a003d27c93271ac9a61849262
@Slf4j
public class MultiRaceCondition2 {


<<<<<<< HEAD
    public static void main(String[] args) throws InterruptedException {
        Thread t1[] = new Thread[100];

        CounterRun counterRun = new CounterRun();

        for (int i = 0; i < 100; i++) {
            t1[i] = new Thread(counterRun);
        }


        Stream.iterate(0, integer -> integer + 1).limit(100).forEach(
                integer -> {
                    t1[integer].start();
                }
        );


        Stream.iterate(0, integer -> integer + 1).limit(100).forEach(
                integer -> {
                    try {
                        t1[integer].join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );




        Thread.sleep(5000);

        log.info("final value " + CounterRun.counter);

=======
    public static void main(String[] args) {
        Thread t1, t2, t3;


        CounterRun counterRun = new CounterRun();
        t1 = new Thread(counterRun);
        t2 = new Thread(counterRun);
        t3 = new Thread(counterRun);

        log.info(Wrapper.counter + " is the final value");
>>>>>>> 7b3c3a864afd180a003d27c93271ac9a61849262
    }
}
