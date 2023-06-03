package Opgave1;

import java.util.Objects;

public class Bil {

    private int registeringsnummer;

    private String mærke;

    private String model;

    private String farve;

    public Bil(int registeringsnummer, String mærke, String model, String farve) {
        this.registeringsnummer = registeringsnummer;
        this.mærke = mærke;
        this.model = model;
        this.farve = farve;
    }

    public int getRegisteringsnummer() {
        return registeringsnummer;
    }

    public void setRegisteringsnummer(int registeringsnummer) {
        this.registeringsnummer = registeringsnummer;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return registeringsnummer == bil.registeringsnummer && mærke.equals(bil.mærke) && Objects.equals(model, bil.model) && farve.equals(bil.farve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registeringsnummer, mærke, model, farve);
    }

    @Override
    public String toString() {
        return "Bil{" +
                "registeringsnummer=" + registeringsnummer +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", farve='" + farve + '\'' +
                '}';
    }
}
