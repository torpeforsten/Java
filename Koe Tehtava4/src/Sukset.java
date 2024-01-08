public class Sukset extends Vuokrattava {
    private int pituus;
    private String merkki;

    public Sukset(int hinta, String kayttoonottopaiva, int pituus, String merkki) {
        super(hinta, kayttoonottopaiva);
        setPituus(pituus);
        setMerkki(merkki);
    }
    public int getPituus() {
        return pituus;
    }

    public void setPituus(int pituus) {
        this.pituus = pituus;
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    @Override
    public String toString() {
        return super.toString() + "Sukset{" +
                "pituus=" + pituus +
                ", merkki='" + merkki + '\'' +
                '}';
    }
}
