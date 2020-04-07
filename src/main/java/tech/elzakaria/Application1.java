package tech.elzakaria;

import lombok.extern.slf4j.Slf4j;

/**
 * Introduction to create thread
 */
@Slf4j
public class Application1 {
    public static void main(String[] args) throws InterruptedException {


        ElZakariaThread elZakariaThread = new ElZakariaThread();

        //sparks a new thread
        elZakariaThread.start();

        //run would just run inside the same thread
        elZakariaThread.run();


        Thread anotherThread = new Thread(new AnotherThread());
        anotherThread.start();


        elZakariaThread.join();
        anotherThread.join();


        log.info("from Main : " + Thread.currentThread().getName());
        System.exit(0);
    }


    public static class ElZakariaThread extends Thread {

        @Override
        public void run() {
            log.info("ElZakariaThread running here! " + Thread.currentThread().getName());

        }
    }

    public static class AnotherThread implements Runnable {

        @Override
        public void run() {
            log.info("ElZakariaThread from AnotherThread running here! " + Thread.currentThread().getName());
        }
    }
}

