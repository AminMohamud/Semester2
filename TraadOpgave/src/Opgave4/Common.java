package Opgave4;

import java.util.concurrent.Semaphore;

public class Common {

    private Semaphore t = new Semaphore(1);

    private Semaphore c = new Semaphore(1);


    int counter1;

    int counter2;

    public synchronized void modtagerBestillingerTjener() throws InterruptedException {
        counter1++;
        System.out.println("Antal ordrer modtaget af tjener: " + counter1);

    }

    public synchronized void modtagerBestillingChef() throws InterruptedException {
        counter2++;
        System.out.println("Antal ordrer modtaget af kok: " + counter2);
    }
}
