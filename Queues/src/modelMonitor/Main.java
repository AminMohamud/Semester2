package modelMonitor;

public class Main {

    public static void main(String[] args) {
        Faelles faelles = new Faelles();

        MyThread thread1 = new MyThread("Tråd 1", faelles);
        MyThread thread2 = new MyThread("Tråd 2", faelles);

        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
            System.out.println("Endelige tal " + faelles.getTaeller());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
