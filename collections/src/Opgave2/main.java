package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Studerende> kirstinebjergstuderende = new ArrayList<>();
        Skole kirstinebjergskolen = new Skole("Kirstinebjergskolen");
        Studerende amin = new Studerende("Amin Dahir",35);
        Studerende kasper = new Studerende("Kasper",32);
        Studerende simon = new Studerende("Simon", 31);

        kirstinebjergstuderende.add(amin);
        kirstinebjergstuderende.add(kasper);
        kirstinebjergstuderende.add(simon);

        kirstinebjergskolen.setStuderendeList(kirstinebjergstuderende);

        kirstinebjergskolen.findStuderende(31);
    }
}
