package modelMonitor;

public class MyThread extends Thread {

    private String navn;
    private Faelles faelles;

    public MyThread(String navn, Faelles faelles) {
        this.navn = navn;
        this.faelles = faelles;
    }


    public void run() {
        for (int j = 0; j < 100; j++) {
            faelles.Kritisksection();
            faelles.TagerRandomTid(10);
        }

        System.out.println(faelles.getTaeller());
    }
}
