import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String sOsake;
        double dOsinkoProsentti;
        int iSijoitus;
        Scanner input = new Scanner(System.in);

        System.out.print("Anna osakkeen nimi: ");
        sOsake = input.next();

        System.out.print("Anna osinkoprosentti: ");
        dOsinkoProsentti = input.nextDouble();

        System.out.print("Anna sijoitettava rahamäärä: ");
        iSijoitus = input.nextInt();

        double dTuotto = (iSijoitus*dOsinkoProsentti)/100;

        System.out.println("Osakkeen " + sOsake + " yhden vuoden tuotto pääomalle " + iSijoitus + " on " + dTuotto);
    }
}