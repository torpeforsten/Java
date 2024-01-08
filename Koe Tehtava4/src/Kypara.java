public class Kypara extends Vuokrattava {

    private int koko;
    private String vari;

    public Kypara(int hinta, String kayttoonottopaiva, int koko, String vari) {
        super(hinta, kayttoonottopaiva);
        setKoko(koko);
        setVari(vari);
    }

    public int getKoko() {
        return koko;
    }

    public void setKoko(int koko) {
        this.koko = koko;
    }

    public String getVari() {
        return vari;
    }

    public void setVari(String vari) {
        this.vari = vari;
    }

    @Override
    public String toString() {
        return super.toString() + "Kypara{" +
                "koko=" + koko +
                ", vari='" + vari + '\'' +
                '}';
    }
}
