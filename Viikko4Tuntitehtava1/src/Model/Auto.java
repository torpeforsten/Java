package Model;

import java.util.Scanner;

public class Auto extends Kulkuneuvo{
    // Jäsenmuuttujat
    private String rekno;
    private int takakontintilavuus;

    // Muodostimet
    public Auto() {
//        System.out.println("Auton muodostinta kutsuttiin");
    }

    public Auto(String nimi, int maxNopeus, int maxHenkilom, String rekno, int takakontintilavuus) {
        super(nimi, maxNopeus, maxHenkilom);
        this.rekno = rekno;
        this.takakontintilavuus = takakontintilavuus;
    }
// Getterit ja setterit
    public String getRekno() {
        return rekno;
    }

    public void setRekno(String rekno) {
        this.rekno = rekno;
    }

    public int getTakakontintilavuus() {
        return takakontintilavuus;
    }

    public void setTakakontintilavuus(int takakontintilavuus) {
        this.takakontintilavuus = takakontintilavuus;
    }
    // Metodit
    @Override
    public String toString() {
        return super.toString() + ", " +
                "Rekisterinumero: " + rekno + ", " +
                "Takakontintilavuus:" + takakontintilavuus + " litraa";
    }

    @Override
    public void kysyTiedot() {
        super.kysyTiedot();
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Anna rekisterinumero: ");
        setRekno(input.nextLine());
        System.out.println("Anna peräkontin tilavuus: ");
        setTakakontintilavuus(input.nextInt());
    }
}
