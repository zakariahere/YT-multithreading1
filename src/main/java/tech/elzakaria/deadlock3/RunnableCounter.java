package tech.elzakaria.deadlock3;

public class RunnableCounter implements Runnable {


    @Override
    public void run() {
        incrementR1EtApresR2();
        incrementR2EtApresR1();
    }

    private void incrementR2EtApresR1() {

        synchronized (R2.class) {
            synchronized (R1.class) {
                R2.r2Counter++;
                R1.r1Counter++;
            }
        }


    }

    private void incrementR1EtApresR2() {

        synchronized (R1.class) {
            synchronized (R2.class) {
                R1.r1Counter++;
                R2.r2Counter++;
            }
        }
    }
}
