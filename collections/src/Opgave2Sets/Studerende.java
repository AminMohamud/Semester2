package Opgave2Sets;

import java.util.Set;

public class Studerende {

    private String navn;

    private int studieNr;

    private Set<Integer> karaktere;

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

    public Set<Integer> getKaraktere() {
        return karaktere;
    }

    public void setKaraktere(Set<Integer> karaktere) {
        this.karaktere = karaktere;
    }

}
