package nepokretnost;

public class Zemljiste {


    int zemljisteId;
    String tipZemljista;
    Lokacija lokacijaId;


    public Zemljiste(int zemljisteId, String tipZemljista, Lokacija lokacijaId) {
        this.zemljisteId = zemljisteId;
        this.tipZemljista = tipZemljista;
        this.lokacijaId = lokacijaId;
    }


    public Zemljiste() {
    }

    public int getZemljisteId() {
        return zemljisteId;
    }

    public void setZemljisteId(int zemljisteId) {
        this.zemljisteId = zemljisteId;
    }

    public String getTipZemljista() {
        return tipZemljista;
    }

    public void setTipZemljista(String tipZemljista) {
        this.tipZemljista = tipZemljista;
    }

    public Lokacija getLokacijaId() {
        return lokacijaId;
    }

    public void setLokacijaId(Lokacija lokacijaId) {
        this.lokacijaId = lokacijaId;
    }


    @Override
    public String toString() {
        return "Zemljiste{" +
                "zemljisteId=" + zemljisteId +
                ", tipZemljista='" + tipZemljista + '\'' +
                ", lokacijaId=" + lokacijaId +
                '}';
    }

}
