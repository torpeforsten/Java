public class Paketti {

    private Sukset sukset;
    private Monot monot;
    private Sauvat sauvat;
    private Kypara kypara;

    public Paketti(Sukset sukset, Monot monot, Sauvat sauvat, Kypara kypara) {
        setSukset(sukset);
        setMonot(monot);
        setSauvat(sauvat);
        setKypara(kypara);
    }

    public Sukset getSukset() {
        return sukset;
    }

    public void setSukset(Sukset sukset) {
        this.sukset = sukset;
    }

    public Monot getMonot() {
        return monot;
    }

    public void setMonot(Monot monot) {
        this.monot = monot;
    }

    public Sauvat getSauvat() {
        return sauvat;
    }

    public void setSauvat(Sauvat sauvat) {
        this.sauvat = sauvat;
    }

    public Kypara getKypara() {
        return kypara;
    }

    public void setKypara(Kypara kypara) {
        this.kypara = kypara;
    }


    public int laskeHinta(){
        int summa = 0;
        summa += sukset.getHinta();
        summa += monot.getHinta();
        summa += sauvat.getHinta();
        summa += kypara.getHinta();

        return summa;
    }

    @Override
    public String toString() {
        return "Paketti{" +
                "sukset='" + sukset.toString() + '\'' +
                ", monot='" + monot.toString() + '\'' +
                ", sauvat='" + sauvat.toString() + '\'' +
                ", kypara='" + kypara.toString() + '\'' +
                '}' + "Kokonaishinta; " + laskeHinta();

    }
}
