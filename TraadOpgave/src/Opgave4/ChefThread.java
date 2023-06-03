package Opgave4;

public class ChefThread extends Thread {

    private Common common;

    private String name;

    public ChefThread(Common common, String name) {
        this.common = common;
        this.name = name;
    }

    public void run() {

        for (int i = 0; i < 100; i++) {
            try {
                common.modtagerBestillingChef();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
