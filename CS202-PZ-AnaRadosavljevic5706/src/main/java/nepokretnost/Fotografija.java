package nepokretnost;

public class Fotografija {


    int fotografijaId;

    Nepokretnost nepokretnostId;

    public Fotografija(int fotografijaId, Nepokretnost nepokretnostId) {
        this.fotografijaId = fotografijaId;
        this.nepokretnostId = nepokretnostId;
    }

    public int getFotografijaId() {
        return fotografijaId;
    }

    public void setFotografijaId(int fotografijaId) {
        this.fotografijaId = fotografijaId;
    }

    public Nepokretnost getNepokretnostId() {
        return nepokretnostId;
    }

    public void setNepokretnostId(Nepokretnost nepokretnostId) {
        this.nepokretnostId = nepokretnostId;
    }


    @Override
    public String toString() {
        return "Fotografija{" +
                "fotografijaId=" + fotografijaId +
                ", nepokretnostId=" + nepokretnostId +
                '}';
    }
}
