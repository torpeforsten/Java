package Model;

import java.util.Scanner;

public class Mopo extends Kulkuneuvo{
    private int satulanpituus;

    public Mopo(){
    }

    public Mopo(String nimi, int maxNopeus, int maxHenkilom, int satulanpituus) {
        super(nimi, maxNopeus, maxHenkilom);
        this.satulanpituus = satulanpituus;
    }

    public int getSatulanpituus() {
        return satulanpituus;
    }

    public void setSatulanpituus(int satulanpituus) {
        this.satulanpituus = satulanpituus;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "Satulanpituus: " + satulanpituus + " cm";
    }
    @Override
    public void kysyTiedot() {
        super.kysyTiedot();
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Anna satulanpituus: ");
        setSatulanpituus(input.nextInt());
    }
}
