package Opgave2;

import java.util.List;

public class Rekursivemetode {


    public int sum(List<Integer> list, int l, int h) {
        if ( l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l + h) / 2;
            int sum1 = sum(list, l, m);
            int sum2 = sum(list, m + 1, h);
            return sum1 + sum2;
        }
    }

    public int sum(List<Integer> list) {

        return sum(list, 0, list.size() - 1);
    }
}
