package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Skole {

    private String navn;

    private List<Studerende> studerendeList = new ArrayList<>();

    public Skole(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public List<Studerende> getStuderendeList() {
        return studerendeList;
    }

    public void setStuderendeList(List<Studerende> studerendeList) {
        this.studerendeList = studerendeList;
    }

    public Studerende addStuderende(Studerende studerende) {
        studerendeList.add(studerende);
        return studerende;
    }

    public Studerende removeStuderende(Studerende studerende) {
        studerendeList.remove(studerende);
        return null;
    }

    public String toString() {
        return " ";
    }

    public double gennemsnit() {
        double sumafKarater = 0;
        double antalKarakter = 0;


        for (Studerende studerende : studerendeList) {
            for (int aKarakter : studerende.getKaraktere()) {
                antalKarakter++;
                sumafKarater += aKarakter;
            }
        }
        return antalKarakter * studerendeList.size();
    }

    public Studerende findStuderende(int studieNr) {

        for (Studerende studerende : studerendeList) {
            if (studerende.getStudieNr() == studieNr) {
                return studerende;
            }
        }
        return null;
    }
}
