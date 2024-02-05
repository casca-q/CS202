package agencija;

public class Klijent {


    public Klijent() {
    }



    public Klijent(int klijentId, String ime, String prezime, Boolean active, Ugovor ugovor) {
        this.klijentId = klijentId;
        this.ime = ime;
        this.prezime = prezime;
        this.active = active;
        this.ugovor = ugovor;
    }

    int klijentId;
    String ime;
    String prezime;
    Boolean active;

    Ugovor ugovor;


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

    public Boolean getActive() {

        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public int getKlijentId() {

        return klijentId;
    }

    public void setKlijentId(int klijentId)
    {
        this.klijentId = klijentId;
    }

    public Ugovor getUgovor() {
        return ugovor;
    }

    public void setUgovor(Ugovor ugovor) {
        this.ugovor = ugovor;
    }

    @Override
    public String toString() {
        return "Klijent{" +
                "klijentId=" + klijentId +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", active=" + active +
                ", ugovor=" + ugovor +
                '}';
    }


}
