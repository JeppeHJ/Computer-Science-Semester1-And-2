package Opgaver.Opgave4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPerMaaned;
    private Kollegie kollegie;
    private ArrayList<Lejeaftale> lejeaftaler;

    public Bolig(int kvm, String adresse, int prisPerMaaned, Kollegie kollegie) {
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPerMaaned = prisPerMaaned;
        this.kollegie = kollegie;
    }

    public Lejeaftale createLejeaftale(LocalDate fraDato, Bolig bolig) {
        Lejeaftale lejeaftale = new Lejeaftale(fraDato, bolig);
        this.lejeaftaler.add(lejeaftale);
        return lejeaftale;
    }

    public ArrayList<Lejeaftale> getLejeaftaler() {
        return lejeaftaler;
    }

    public void setKollegie(Kollegie kollegie) {
        if (this.kollegie != kollegie) {
            Kollegie oldKollegie = this.kollegie;
            this.kollegie = kollegie;
            oldKollegie.removeBolig(this);
        }
    }

    public void addLejeaftale(Lejeaftale lejeaftale) {
        if (!this.lejeaftaler.contains(lejeaftale)) {
            this.lejeaftaler.add(lejeaftale);
        }
    }

    public int getKvm() {
        return kvm;
    }

    public void setKvm(int kvm) {
        this.kvm = kvm;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPrisPerMaaned() {
        return prisPerMaaned;
    }

    public void setPrisPerMaaned(int prisPerMaaned) {
        this.prisPerMaaned = prisPerMaaned;
    }
}
