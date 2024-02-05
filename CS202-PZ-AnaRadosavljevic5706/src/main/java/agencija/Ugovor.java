package agencija;

import nepokretnost.Nepokretnost;

import java.util.Date;

public class Ugovor {


    int ugovorId;
    String tipTransakcije;
    Date datumNastanka;
    Date datumIsteka;
    Vlasnik vlasnik;

    Klijent klijent;
    Nepokretnost nepokretnost;
    Agencija agencija;

    public Ugovor() {
    }
    public Ugovor(int ugovorId, String tipTransakcije, Date datumNastanka, Date datumIsteka, Vlasnik vlasnik, Klijent klijent, Nepokretnost nepokretnost, Agencija agencija) {
        this.ugovorId = ugovorId;
        this.tipTransakcije = tipTransakcije;
        this.datumNastanka = datumNastanka;
        this.datumIsteka = datumIsteka;
        this.vlasnik = vlasnik;
        this.klijent = klijent;
        this.nepokretnost = nepokretnost;
        this.agencija = agencija;
    }

    public String getTipTransakcije() {
        return tipTransakcije;
    }

    public void setTipTransakcije(String tipTransakcije) {
        this.tipTransakcije = tipTransakcije;
    }

    public Date getDatumNastanka() {
        return datumNastanka;
    }

    public void setDatumNastanka(Date datumNastanka) {
        this.datumNastanka = datumNastanka;
    }

    public Date getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(Date datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    public int getUgovorId() {
        return ugovorId;
    }

    public void setUgovorId(int ugovorId) {
        this.ugovorId = ugovorId;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public Nepokretnost getNepokretnost() {
        return nepokretnost;
    }

    public void setNepokretnost(Nepokretnost nepokretnost) {
        this.nepokretnost = nepokretnost;
    }

    public Agencija getAgencija() {
        return agencija;
    }

    public void setAgencija(Agencija agencija) {
        this.agencija = agencija;
    }

    @Override
    public String toString() {
        return "Ugovor{" +
                "ugovorId=" + ugovorId +
                ", tipTransakcije='" + tipTransakcije + '\'' +
                ", datumNastanka=" + datumNastanka +
                ", datumIsteka=" + datumIsteka +
                ", vlasnik=" + vlasnik +
                ", klijent=" + klijent +
                ", nepokretnost=" + nepokretnost +
                ", agencija=" + agencija +
                '}';
    }

}
