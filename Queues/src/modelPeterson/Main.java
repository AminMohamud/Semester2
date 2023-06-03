package modelPeterson;

public class Main {

    private static int turn;
    private static boolean[] flag;

    public static void main(String[] args) {
        flag = new boolean[2];
        flag[0] = false;
        flag[1] = false;
        turn = 1;


        Faelles faelles = new Faelles();

        MyThread thread1 = new MyThread("Tråd 1", faelles);
        MyThread2 thread2 = new MyThread2("Tråd 2", faelles);

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

    public static int getTurn() {
        return turn;
    }

    public static void setTurn(int value) {
        turn = value;
    }

    public static boolean getFlag(int index) {
        return flag[index];
    }

    public static void setFlag(int index, boolean b) {
        flag[index] = b;
    }



}
