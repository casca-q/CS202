package nepokretnost;

import agencija.Vlasnik;

public class NepokretnostDodatno extends Nepokretnost  {


    int nepokretnostDodatnoId;
    boolean terasa;
    boolean parking;
    boolean klima;
    String tipGrejanja;
    boolean kablovska;

    public NepokretnostDodatno(int nepokretnostId, String tipNepokretnosti, int povrsinaSqm, int cena, NepokretnostDodatno nepokretnostDodatno, Vlasnik vlasnik, Lokacija lokacija, Fotografija fotografija, int nepokretnostDodatnoId, boolean terasa, boolean parking, boolean klima, String tipGrejanja, boolean kablovska) {
        super(nepokretnostId, tipNepokretnosti, povrsinaSqm, cena, nepokretnostDodatno, vlasnik, lokacija, fotografija);
        this.nepokretnostDodatnoId = nepokretnostDodatnoId;
        this.terasa = terasa;
        this.parking = parking;
        this.klima = klima;
        this.tipGrejanja = tipGrejanja;
        this.kablovska = kablovska;
    }

    public int getNepokretnostDodatnoId() {
        return nepokretnostDodatnoId;
    }

    public void setNepokretnostDodatnoId(int nepokretnostDodatnoId) {
        this.nepokretnostDodatnoId = nepokretnostDodatnoId;
    }

    public boolean isTerasa() {
        return terasa;
    }

    public void setTerasa(boolean terasa) {
        this.terasa = terasa;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isKlima() {
        return klima;
    }

    public void setKlima(boolean klima) {
        this.klima = klima;
    }

    public String getTipGrejanja() {
        return tipGrejanja;
    }

    public void setTipGrejanja(String tipGrejanja) {
        this.tipGrejanja = tipGrejanja;
    }

    public boolean isKablovska() {
        return kablovska;
    }

    public void setKablovska(boolean kablovska) {
        this.kablovska = kablovska;
    }


    @Override
    public String toString() {
        return "NepokretnostDodatno{" +
                "nepokretnostDodatnoId=" + nepokretnostDodatnoId +
                ", terasa=" + terasa +
                ", parking=" + parking +
                ", klima=" + klima +
                ", tipGrejanja='" + tipGrejanja + '\'' +
                ", kablovska=" + kablovska +
                '}';
    }


}
