package Model;

import java.util.Scanner;

public class Kulkuneuvo {
    // Jäsenmuuttujat
    private String nimi;
    private int maxNopeus;

    private int maxHenkilom;

    // Muodostimet
    public Kulkuneuvo() {
//        System.out.println("Kulkuneuvon muodostinta kutsuttiin");
    }
    public Kulkuneuvo(String nimi, int maxNopeus, int maxHenkilom) {
        this.nimi = nimi;
        this.maxNopeus = maxNopeus;
        this.maxHenkilom = maxHenkilom;
    }
    // getterit ja setterit

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getMaxNopeus() {
        return maxNopeus;
    }

    public void setMaxNopeus(int maxNopeus) {
        this.maxNopeus = maxNopeus;
    }

    public int getMaxHenkilom() {
        return maxHenkilom;
    }

    public void setMaxHenkilom(int maxHenkilom) {
        this.maxHenkilom = maxHenkilom;
    }
    // Metodit
    @Override
    public String toString() {
        return "Kulkuväline: " + nimi + ", " +
                "Nopeus: " + maxNopeus + " km/h, " +
                "Max Henkilömäärä: " + maxHenkilom + " henkilöä";
    }
    public void kysyTiedot() {
        Scanner input = new Scanner(System.in);
        System.out.println("Syötä kulkuväline: ");
        setNimi(input.nextLine());
        System.out.println("Anna max nopeus: ");
        setMaxNopeus(input.nextInt());
        System.out.println("Anna max henkilömäärä: ");
        setMaxHenkilom(input.nextInt());
    }
}
