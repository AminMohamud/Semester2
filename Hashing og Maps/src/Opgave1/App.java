package Opgave1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Bil> bilSet = new HashSet<>();
        Bil bil = new Bil(1, "BMW", "2024","Lilla");
        Bil bil1 = new Bil(1, "BMW", "2024","Lilla");
        Bil bil2 = new Bil(2,"Jaguar","2021","Gul");
        Bil bil3 = new Bil(3,"Citroen","2019","Mørke grøn");
        bilSet.add(bil);
        bilSet.add(bil1);
        bilSet.add(bil2);
        bilSet.add(bil3);

        for (Bil biller: bilSet ) {
            System.out.println(biller);

        }


    }
}
