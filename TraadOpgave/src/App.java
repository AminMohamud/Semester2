public class App {
    public static void main(String[] args) {
        Common common = new Common();
        Waiterthread waiterthread1 = new Waiterthread(common, "Anders");
        Waiterthread waiterthread2 = new Waiterthread(common, "Amin");

        ChefThread chefThread = new ChefThread(common, "Kasper");

        waiterthread1.start();
        waiterthread2.start();
        chefThread.start();
    }
}
