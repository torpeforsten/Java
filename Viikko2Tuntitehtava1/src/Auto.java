public class Auto {
    //jasenmuuttujat
    private String rekno;
    private String merkki;

    // Muodostimet / Alustajat / Konstruktiot

    public Auto() {

    }

    public Auto(String rekno, String merkki) { // ns Oletusmuodostin
        setRekno(rekno);
        this.merkki = merkki;
    }
    public Auto(String rekno) { // ns Oletusmuodostin
        this.setRekno(rekno);

    }


    // Getters ja Setters
    public void setRekno(String rekno) {
        if (rekno != null && rekno.length() > 7)
            this.rekno = rekno.substring(0,7);
        else
            this.rekno = rekno;
    }

    public String getRekno() {
        return rekno;
    }

    // Getters ja Setters
    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMerkki() {
        return merkki;
    }

    // Jäsenfunktiot eli metodit
    @Override
    public String toString() {
        return this.rekno + " " + this.merkki;
    }
}