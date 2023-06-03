package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Rekursivemetode testObjekt = new Rekursivemetode();
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(3);
        list.add(6);

        System.out.println(testObjekt.sum(list));



    }
}
