package Opgave4;

public class Waiterthread extends Thread{


   private Common common;

   private String name;

   public Waiterthread (Common common, String name) {
       this.common = common;
       this.name = name;

   }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                common.modtagerBestillingerTjener();
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
