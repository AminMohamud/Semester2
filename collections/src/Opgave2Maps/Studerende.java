package Opgave2Maps;

import java.util.ArrayList;
import java.util.List;

public class Studerende {

    private String navn;

    private int studieNr;

    private List<Integer> karaktere = new ArrayList<>();

    public Studerende(String navn, int studieNr) {
        this.navn = navn;
        this.studieNr = studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getStudieNr() {
        return studieNr;
    }

    public void setStudieNr(int studieNr) {
        this.studieNr = studieNr;
    }

    public List<Integer> getKaraktere() {
        return karaktere;
    }

    public void setKaraktere(List<Integer> karaktere) {
        this.karaktere = karaktere;
    }

}
