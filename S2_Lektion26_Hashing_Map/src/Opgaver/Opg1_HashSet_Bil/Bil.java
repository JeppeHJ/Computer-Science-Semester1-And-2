package Opgaver.Opg1_HashSet_Bil;

import java.util.Objects;

public class Bil implements Comparable<Bil> {
    private String registreringsnummer;
    private String mærke;
    private String model;
    private String farve;

    public Bil(String registreringsnummer, String mærke, String model, String farve) {
        this.registreringsnummer = registreringsnummer;
        this.mærke = mærke;
        this.model = model;
        this.farve = farve;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
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
    public boolean equals(Object obj) {
        if (obj instanceof Bil) {
            Bil o = (Bil) obj;
            return (this.getRegistreringsnummer().equals(o.getRegistreringsnummer()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.registreringsnummer);
    }


    public int compareTo(Bil o) {
        String thisRegistreringsnummer = this.getRegistreringsnummer();
        String otherRegistreringsnummer = o.getRegistreringsnummer();
        String thisMærke = this.getMærke();
        String otherMærke = o.getMærke();

        int registreringsnummerComparison = thisRegistreringsnummer.compareTo(otherRegistreringsnummer);
        if (registreringsnummerComparison != 0) {
            return registreringsnummerComparison;
        } else {
            return thisMærke.compareTo(otherMærke);
        }
    }

}

