import java.util.Scanner;

public class Tuntitehtava1 {
    public static void main(String[] args) {
        // Esitellään muuttuja kuten C#
        int iLuku1, iLuku2;

        // Tarvitaan scanner käyttääkseen importtia(ReadLine)
        Scanner input = new Scanner(System.in);

        // System.Out.print käytetään tulostaessa(WriteLine)
        System.out.print("Anna ekaluku: ");
        // Input.Next(Määritellään input, eli käyttäjältä luku)
        iLuku1 = input.nextInt();

        System.out.print("Anna tokaluku: ");
        iLuku2 = input.nextInt();

        // Tehdään lukujen laskutoimitus
        double osamaara = (double) iLuku1/iLuku2;

        // Alla oleva on pidempi pätkä koodia
        System.out.println("Osamäärä on: " + osamaara);
        // Alla oleva on siistimpi pätkä koodia
        System.out.printf("Osamäärä on %5.2f", osamaara);
    }
}