package Opgaver.Opgave4;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Kollegie {
    private String navn;
    private String adresse;
    private ArrayList<Bolig> boliger;

    public Kollegie(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
    }

    public int getAntalLejeAftaler() {
        int sum = 0;
        for (Bolig bolig: this.boliger) {
            sum += bolig.getLejeaftaler().size();
        }
        return sum;
    }

    public double gennemsnitligAntalDage() {
        int sum = 0;
        int count = 0;
        for (Bolig bolig: this.boliger) {
            for (Lejeaftale lejeaftale: bolig.getLejeaftaler()) {
                if (lejeaftale.getTilDato() != null) {
                    count++;
                    sum += ChronoUnit.DAYS.between(lejeaftale.getFraDato(),lejeaftale.getTilDato());
                }
            }
        }
        return 1.0 * sum / count;
    }

    public void createBolig(int kvm, String adresse, int prisPerMaaned) {
        Bolig bolig = new Bolig(kvm,adresse,prisPerMaaned, this);
        this.boliger.add(bolig);
    }

    public void removeBolig(Bolig bolig) {
        if (this.boliger.contains(bolig)) {
            this.boliger.remove(bolig);
            bolig.setKollegie(null);
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
