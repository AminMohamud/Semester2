package Opgave1;

import java.util.HashSet;

public class AnvendMetoderPaaHashSet {
    public static void main(String[] args) {
        //Opgave 1.1
        HashSet<Integer> helTal = new HashSet<Integer>();

        //Opgave 1.2
        helTal.add(34);
        helTal.add(12);
        helTal.add(23);
        helTal.add(45);
        helTal.add(67);
        helTal.add(34);
        helTal.add(98);

        //Opgave 1.3
        //System.out.println(helTal);

        //Opgave 1.4
        helTal.add(23);

        //Opgave 1.5
        // System.out.println(helTal);

        //Opgave 1.6
        helTal.remove(67);

        //Opgave 1.7
        System.out.println(helTal);

        //Opgave 1.8
            System.out.println(helTal.contains(23));

    }
}
