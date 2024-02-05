package nepokretnost;

import agencija.Vlasnik;

public class Nepokretnost {



    int nepokretnostId;
    String tipNepokretnosti;
    int povrsinaSqm;
    int cena;
    NepokretnostDodatno nepokretnostDodatno;
    Vlasnik vlasnik;

    Lokacija lokacija;
    Fotografija fotografija;

    public Nepokretnost(int nepokretnostId, String tipNepokretnosti, int povrsinaSqm, int cena, NepokretnostDodatno nepokretnostDodatno, Vlasnik vlasnik, Lokacija lokacija, Fotografija fotografija) {
        this.nepokretnostId = nepokretnostId;
        this.tipNepokretnosti = tipNepokretnosti;
        this.povrsinaSqm = povrsinaSqm;
        this.cena = cena;
        this.nepokretnostDodatno = nepokretnostDodatno;
        this.vlasnik = vlasnik;
        this.lokacija = lokacija;
        this.fotografija = fotografija;
    }

    public Nepokretnost() {
    }

    public int getNepokretnostId() {
        return nepokretnostId;
    }

    public void setNepokretnostId(int nepokretnostId) {
        this.nepokretnostId = nepokretnostId;
    }

    public String getTipNepokretnosti() {
        return tipNepokretnosti;
    }

    public void setTipNepokretnosti(String tipNepokretnosti) {
        this.tipNepokretnosti = tipNepokretnosti;
    }

    public int getPovrsinaSqm() {
        return povrsinaSqm;
    }

    public void setPovrsinaSqm(int povrsinaSqm) {
        this.povrsinaSqm = povrsinaSqm;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }



    public NepokretnostDodatno getNepokretnostDodatno() {
        return nepokretnostDodatno;
    }

    public void setNepokretnostDodatno(NepokretnostDodatno nepokretnostDodatno) {
        this.nepokretnostDodatno = nepokretnostDodatno;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public Fotografija getFotografija() {
        return fotografija;
    }

    public void setFotografija(Fotografija fotografija) {
        this.fotografija = fotografija;
    }

    @Override
    public String toString() {
        return "Nepokretnost{" +
                "nepokretnostId=" + nepokretnostId +
                ", tipNepokretnosti='" + tipNepokretnosti + '\'' +
                ", povrsinaSqm=" + povrsinaSqm +
                ", cena=" + cena +
                ", nepokretnostDodatno=" + nepokretnostDodatno +
                ", vlasnik=" + vlasnik +
                ", lokacija=" + lokacija +
                ", fotografija=" + fotografija +
                '}';
    }
}
