package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        RekursiveMetoder rekursiveMetoder = new RekursiveMetoder();


        List<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(3);
        list.add(6);

        System.out.println(rekursiveMetoder.sum(list));
    }

}
