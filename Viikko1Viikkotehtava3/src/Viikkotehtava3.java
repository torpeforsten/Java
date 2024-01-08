import java.util.Scanner;

public class Viikkotehtava3 {
    public static void main(String[] args)
    {
        double dPalkka = 0, dKokonaispalkka = 0, dKeskiarvo = 0, dSuurin = 0;
        int iLaskuri = 1;
        try(Scanner scan = new Scanner (System.in))
        {
            while (true)
            {

                System.out.print("Anna " + iLaskuri + ".Kuukauden tulo(-1 Lopettaa): ");
                dPalkka = scan.nextDouble();
                if (dPalkka > dSuurin)
                    dSuurin = dPalkka;
                iLaskuri++;


                if (dPalkka == -1)
                    break;

                dKokonaispalkka += dPalkka;
                dKeskiarvo = dKokonaispalkka / (iLaskuri -1) ;

            }
        }
        catch (Exception e)
        {
        }

        System.out.println("Kokonaistulot ovat: " + dKokonaispalkka);
        System.out.println("Keskiarvoinen kuukausikohtainen tulo on: " + Math.round(dKeskiarvo));
        System.out.println("Suurin kuukausikohtainen tulo on: " + dSuurin);
    }
}
