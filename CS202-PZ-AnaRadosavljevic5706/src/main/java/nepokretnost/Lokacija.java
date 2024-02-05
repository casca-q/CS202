package nepokretnost;

public class Lokacija {


    int lokacijaId;
    String drzava;
    String grad;
    String ulica;


    public Lokacija() {
    }


    public Lokacija(int lokacijaId, String drzava, String grad, String ulica) {
        this.lokacijaId = lokacijaId;
        this.drzava = drzava;
        this.grad = grad;
        this.ulica = ulica;
    }


    public int getLokacijaId() {
        return lokacijaId;
    }

    public void setLokacijaId(int lokacijaId) {
        this.lokacijaId = lokacijaId;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }


    @Override
    public String toString() {
        return "Lokacija{" +
                "lokacijaId=" + lokacijaId +
                ", drzava='" + drzava + '\'' +
                ", grad='" + grad + '\'' +
                ", ulica='" + ulica + '\'' +
                '}';
    }

}
