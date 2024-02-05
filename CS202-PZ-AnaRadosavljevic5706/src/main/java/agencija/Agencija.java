package agencija;

public class Agencija {

    // sjngleton
    private static Agencija instance;

    int agencijaId;
    int naknadaProcenat;

    public Agencija(int agencijaId, int naknadaProcenat) {
        this.agencijaId = agencijaId;
        this.naknadaProcenat = naknadaProcenat;
    }

    public static Agencija getInstance(int agencijaId, int naknadaProcenat) {
        if (instance == null) {
            instance = new Agencija(agencijaId, naknadaProcenat);
        }
        return instance;
    }
    // singleton

    public Agencija() {
    }

    public int getAgencijaId() {
        return agencijaId;
    }

    public void setAgencijaId(int agencijaId) {
        this.agencijaId = agencijaId;
    }

    public int getNaknadaProcenat() {
        return naknadaProcenat;
    }

    public void setNaknadaProcenat(int naknadaProcenat) {
        this.naknadaProcenat = naknadaProcenat;
    }

    @Override
    public String toString() {
        return "Agencija{" +
                "agencijaId=" + agencijaId +
                ", naknadaProcenat=" + naknadaProcenat +
                '}';
    }
}
