package modelPeterson;

public class MyThread2 extends Thread {

    private String navn;
    private Faelles faelles;

    public MyThread2(String navn, Faelles faelles) {
        this.navn = navn;
        this.faelles = faelles;
    }


    public void run() {


        for (int j = 0; j < 100; j++) {
            Main.setFlag(1, true);
            Main.setTurn(0);
            while (Main.getFlag(0) && Main.getTurn() == 0) {}

            faelles.Kritisksection();
            Main.setFlag(1, false);

            faelles.TagerRandomTid(100);
        }


        System.out.println(faelles.getTaeller());
    }
}