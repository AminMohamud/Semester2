package Opgave2Maps;

import Opgave2.Studerende;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Skole {

    private String navn;

    private HashMap<Integer, Studerende> studerendeMap = new HashMap();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public HashMap<Studerende, String> getStuderendeList() {
        return studerendeMap;
    }

    public void setStuderendeList(List<Opgave2.Studerende> studerendeList) {
        this.studerendeList = studerendeList;
    }

    public Opgave2.Studerende addStuderende(Opgave2.Studerende studerende) {
        studerendeList.add(studerende);
        return studerende;
    }

    public Opgave2.Studerende removeStuderende(Opgave2.Studerende studerende) {
        studerendeList.remove(studerende);
        return null;
    }

    public String toString() {
        return " ";
    }

    public double gennemsnit() {
        double sumafKarater = 0;
        double antalKarakter = 0;


        for (Opgave2.Studerende studerende : studerendeList) {
            for (int aKarakter : studerende.getKaraktere()) {
                antalKarakter++;
                sumafKarater += aKarakter;
            }
        }
        return antalKarakter * studerendeList.size();
    }

    public Opgave2.Studerende findStuderende(int studieNr) {

        for (Studerende studerende : studerendeList) {
            if (studerende.getStudieNr() == studieNr) {
                return studerende;
            }
        }
        return null;
    }
}
