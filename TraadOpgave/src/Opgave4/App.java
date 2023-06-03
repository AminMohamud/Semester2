package Opgave4;

public class App {
    public static void main(String[] args) {
        Common common = new Common();
        Waiterthread waiterthread1 = new Waiterthread(common, "Anders");
        Waiterthread waiterthread2 = new Waiterthread(common, "Amin");

        ChefThread chefThread = new ChefThread(common, "Kasper");
        ChefThread chefThread1 = new ChefThread(common, "Ole");

        waiterthread1.start();
        waiterthread2.start();
        chefThread.start();
        chefThread1.start();

    }
}
