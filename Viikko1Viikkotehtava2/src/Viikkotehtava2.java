import java.util.Scanner;

public class Viikkotehtava2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Syötä leveys: ");
        int iLeveys = input.nextInt();

        System.out.print("Syötä korkeus: ");
        int iKorkeus = input.nextInt();

        System.out.println("Täytetäänkö neliö? k=Kyllä, e= Ei: ");
        String sSyote = input.next();


        if (sSyote.equals("k")) {
            printFilledRectangle("#", iLeveys, iKorkeus);
        }
        if (sSyote.equals("e")) {
            printEmptyRectangle("#", iLeveys, iKorkeus);
        }

    }

    private static void printFilledRectangle(String sMerkki, int iLeveys, int iKorkeus) {
        for (int i = 1; i <= iKorkeus; i++) {
            for (int j = 1; j <= iLeveys; j++) {
                System.out.print(sMerkki);
            }
            System.out.println();
        }
    }

    private static void printEmptyRectangle(String sMerkki, int iLeveys, int iKorkeus) {
        for (int j = 1; j <= iLeveys; j++) {
            System.out.print(sMerkki);
        }
        System.out.println();
        for (int i = 1; i <= iKorkeus - 2; i++) {
            System.out.print(sMerkki);
            for (int j = 1; j <= iLeveys - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(sMerkki);
        }
        for (int j = 1; j <= iLeveys; j++) {
            System.out.print(sMerkki);
        }
    }
}