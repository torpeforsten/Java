public class Sauvat extends Vuokrattava {

    private int pituus;

    public Sauvat(int hinta, String kayttoonottopaiva, int pituus) {
        super(hinta, kayttoonottopaiva);
        setPituus(pituus);
    }

    public int getPituus() {
        return pituus;
    }

    public void setPituus(int pituus) {
        this.pituus = pituus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pituus=" + pituus +
                '}';
    }
}
