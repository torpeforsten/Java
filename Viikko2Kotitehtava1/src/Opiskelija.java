public class Opiskelija {

    // Jäsenmuuttujat
    private String etunimi;
    private String sukunimi;
    private int opiskelijanumero;
    private String osoite;

    // Muodostin

    public Opiskelija(){

            setEtunimi("Roope");
            setSukunimi("Forstén");
            setOpiskelijanumero(2004);
            setOsoite("Kärängänkatu 1 A2");

    }
    public Opiskelija(String etunimi, String sukunimi, int opiskelijanumero, String osoite) {
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.opiskelijanumero = opiskelijanumero;
        this.osoite = osoite;
    }
    // Getterit ja setterit

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public int getOpiskelijanumero() {
        return opiskelijanumero;
    }

    public void setOpiskelijanumero(int opiskelijanumero) {
        this.opiskelijanumero = opiskelijanumero;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    // Metodit

    @Override
    public String toString() {
        return "Opiskelija{" +
                "etunimi='" + etunimi + '\'' +
                ", sukunimi='" + sukunimi + '\'' +
                ", opiskelijanumero=" + opiskelijanumero +
                ", osoite='" + osoite + '\'' +
                '}';
    }
}
