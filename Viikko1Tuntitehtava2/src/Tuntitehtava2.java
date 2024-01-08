import java.util.Scanner;

public class Tuntitehtava2 {
    public static void main(String[] args) {
        int iArvottu, iArvaus;
        Scanner input = new Scanner(System.in);

        // Lisätään ranom muuttuja väliltä 1-100
        iArvottu = (int) (Math.random() * 101);

        // Käytetään infinity looppia, joka tarkistaa onko arvaus isompi vai pienempi,
        // kuin arvottu luku.
        while (true) {
            System.out.print("Anna arvauksesi väliltä 1-100: ");
            iArvaus = input.nextInt();
            if (iArvaus < iArvottu)
                System.out.println ("Liian pieni");
            else if (iArvaus > iArvottu)
                System.out.println("Liian suuri");
            else
            {
                System.out.println("Arvasit oikein! Luku oli " + iArvottu + "!");
                break;
            }
        }
    }
}