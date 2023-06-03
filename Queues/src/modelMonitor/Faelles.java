package modelMonitor;

import java.util.Random;

public class Faelles {

    private int global = 0;



    public synchronized void Kritisksection() {
        int temp;
        temp = global;
        TagerRandomTid(1000);
        global = temp + 1;
    }


    public void TagerRandomTid(int max) {
        Random r = new Random();
        int nymax = Math.abs(r.nextInt()) % max + 1;

        for (int i = 0; i < nymax; i++) {
            for (int j = 0; j < nymax; j++) {
                int a = 5;
                int b = 10;
                a += b;
                b -= a;
            }
        }
    }


    public int getTaeller() {
        return global;
    }
}
