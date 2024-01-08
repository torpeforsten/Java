import java.util.Date;
import java.util.*;

public class Auto {

    // Jäsenmuuttujat
    private String rekisterinumero;
    private String merkki;
    private String malli;
    private int vuosimalli;



    // muodostimet

    public Auto() {
    }

    public Auto(String rekisterinumero, String merkki, String malli) {
        this.setRekisterinumero(rekisterinumero);
        this.setMerkki(merkki);
        this.setMalli(malli);
    }

    public Auto(int vuosimalli) {
        this.setVuosimalli(vuosimalli);
    }

    // Getterit ja setterit

    public String getRekisterinumero() {
        return rekisterinumero;
    }

    public void setRekisterinumero(String rekisterinumero) {
        if ((rekisterinumero != null && rekisterinumero.length() <= 7) && rekisterinumero.contains("-"))
            this.rekisterinumero = rekisterinumero;
        else
            this.rekisterinumero = "Unknown";
    }

    public String getMerkki() {
        return merkki;
    }

    public void setMerkki(String merkki) {
        this.merkki = merkki;
    }

    public String getMalli() {
        return malli;
    }

    public void setMalli(String malli) {
        this.malli = malli;
    }

    public int getVuosimalli() {
        return vuosimalli;
    }

    public void setVuosimalli(int vuosimalli) {
        int y = new Date().getYear()+1900;
        if (vuosimalli >= 1900 && vuosimalli < y)
            this.vuosimalli = vuosimalli;
        else
            this.vuosimalli = 1900;
    }

    // metodit
    public void kysyTiedot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Syötä auton rekisterinumero: ");
        setRekisterinumero(sc.next());
        System.out.print("Syötä auton merkki: ");
        setMerkki(sc.next());
        System.out.print("Syötä auton malli: ");
        setMalli(sc.next());
        System.out.print("Syötä auton vuosimalli:");
        setVuosimalli(sc.nextInt());
        sc.nextLine();

    }

    @Override
    public String toString() {
        return "Auto{" +
                "rekisterinumero='" + rekisterinumero + '\'' +
                ", merkki='" + merkki + '\'' +
                ", malli='" + malli + '\'' +
                ", vuosimalli=" + vuosimalli +
                '}';
    }
}

