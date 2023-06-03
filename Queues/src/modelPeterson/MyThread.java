package modelPeterson;

public class MyThread extends Thread {

    private String navn;
    private Faelles faelles;

    public MyThread(String navn, Faelles faelles) {
        this.navn = navn;
        this.faelles = faelles;
    }


    public void run() {

        for (int j = 0; j < 100; j++) {
            Main.setFlag(0, true);
            Main.setTurn(1);
            while (Main.getFlag(1) && Main.getTurn() == 1) {}
            faelles.Kritisksection();
            Main.setFlag(0, false);

            faelles.TagerRandomTid(200);
        }

        System.out.println(faelles.getTaeller());
    }
}
