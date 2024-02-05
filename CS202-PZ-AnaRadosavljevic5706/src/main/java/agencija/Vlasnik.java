package agencija;

import nepokretnost.Nepokretnost;

public class Vlasnik {


    int vlasnikId;
    String ime;
    String prezime;
    String adresa;
    String telefon;
    Nepokretnost nepokretnost;


    public Vlasnik() {
    }
    public Vlasnik(int vlasnikId, String ime, String prezime, String adresa, String telefon, Nepokretnost nepokretnost) {
        this.vlasnikId = vlasnikId;
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.telefon = telefon;
        this.nepokretnost = nepokretnost;
    }


    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
    public int getVlasnikId() {
        return vlasnikId;
    }

    public void setVlasnikId(int vlasnikId) {
        this.vlasnikId = vlasnikId;
    }

    public Nepokretnost getNepokretnost() {
        return nepokretnost;
    }

    public void setNepokretnost(Nepokretnost nepokretnost) {
        this.nepokretnost = nepokretnost;
    }

    @Override
    public String toString() {
        return "Vlasnik{" +
                "vlasnikId=" + vlasnikId +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", adresa='" + adresa + '\'' +
                ", telefon='" + telefon + '\'' +
                ", nepokretnost=" + nepokretnost +
                '}';
    }

}
