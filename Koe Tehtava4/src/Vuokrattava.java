public class Vuokrattava {
    private int hinta;
    private String kayttoonottopaiva;

    public Vuokrattava() {
    }

    public Vuokrattava(int hinta, String kayttoonottopaiva) {
        setHinta(hinta);
        setKayttoonottopaiva(kayttoonottopaiva);
    }

    public int getHinta() {
        return hinta;
    }

    public void setHinta(int hinta) {
        this.hinta = hinta;
    }

    public String getKayttoonottopaiva() {
        return kayttoonottopaiva;
    }

    public void setKayttoonottopaiva(String kayttoonottopaiva) {
        this.kayttoonottopaiva = kayttoonottopaiva;
    }

    @Override
    public String toString() {
        return "Vuokrattava{" +
                "hinta=" + hinta +
                ", kayttoonottopaiva='" + kayttoonottopaiva + '\'' +
                '}';
    }
}

