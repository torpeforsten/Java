public class Monot extends Vuokrattava {

    private int koko;
    private double jaykkyys;

    public Monot(int hinta, String kayttoonottopaiva, int koko, double jaykkyys) {
        super(hinta, kayttoonottopaiva);
        setKoko(koko);
        setJaykkyys(jaykkyys);
    }

    public int getKoko() {
        return koko;
    }

    public void setKoko(int koko) {
        this.koko = koko;
    }

    public double getJaykkyys() {
        return jaykkyys;
    }

    public void setJaykkyys(double jaykkyys) {
        this.jaykkyys = jaykkyys;
    }

    @Override
    public String toString() {
        return super.toString()+  "Monot{" +
                "koko=" + koko +
                ", jäykkyys=" + jaykkyys +
                '}';
    }
}
