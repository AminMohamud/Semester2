package Opgave1;

import java.util.ArrayList;
import java.util.List;

public class RekursiveMetoder {
    public static void main(String[] args) {
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



    }


    //Skriv en rekursiv metode, der summere alle elementer i en List.
    public int sum(List<Integer> list) {

        return sum(list, 0, list.size() - 1);
    }

    public int sum(List<Integer> list, int l, int h) {
        if ( l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int sum1 = sum(list, l, m);
            int sum2 = sum(list, m + 1, h);

            return sum1 + sum2;
        }

    }



}

