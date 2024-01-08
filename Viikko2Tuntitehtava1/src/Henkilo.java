public class Henkilo {
    // Jäsenmuuttujat
    private String etunimi;
    private String sukunimi;
    private String sotu;
    private double pituus;
    private double paino;

    // Muodostimet

    public Henkilo() {
    }

    public Henkilo(String etunimi, String sukunimi, String sotu, double pituus, double paino) {
        this(etunimi, sukunimi, sotu);
        setPituus(pituus);
        setPaino(paino);
    }

    public Henkilo(String etunimi, String sukunimi, String sotu) {
        this();
        setEtunimi(etunimi);
        setSukunimi(sukunimi);
        setSotu(sotu);
    }
    // Getterit ja setterit

    public String getEtunimi() {
        if (etunimi != null) {
            String en = this.etunimi.substring(0, 1).toUpperCase() +
                    this.etunimi.substring(1, this.etunimi.length()).toLowerCase();
            return en;
        }
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        if (sukunimi != null) {
            String sn = this.sukunimi.substring(0, 1).toUpperCase() +
                    this.sukunimi.substring(1, this.sukunimi.length()).toLowerCase();
            return sn;
        }
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getSotu() {
        return sotu;
    }

    public void setSotu(String sotu) {
        if (sotu != null && sotu.length() != 11)
            this.sotu = "Sotu väärin";
        else
            this.sotu = sotu;
    }

    public double getPituus() {
        return pituus;
    }

    public void setPituus(double pituus) {
        this.pituus = pituus;
    }

    public double getPaino() {
        return paino;
    }

    public void setPaino(double paino) {
        this.paino = paino;
    }

    // Metodit


    @Override
    public String toString() {
        return "Henkilo{" +
                "etunimi='" + getEtunimi() + '\'' +
                ", sukunimi='" + getSukunimi() + '\'' +
                ", sotu='" + sotu + '\'' +
                ", pituus=" + pituus +
                ", paino=" + paino +
                ", bmi=" + Math.round(getBmi()) +
                '}';
    }
    public double getBmi(){
        if(this.pituus > 0)
            return this.paino / Math.pow(this.pituus, 2);
        else
            return 0;
    }
}
