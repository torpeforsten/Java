import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Viikkotehtava4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lVoittoNumerot = new ArrayList<>();
        Random rn = new Random();

        for(int i = 0; i < 7; i++) {
            while (true) {
                int iVoittoNumero = rn.nextInt(40) + 1;
                if(!lVoittoNumerot.contains(iVoittoNumero)){
                    lVoittoNumerot.add(iVoittoNumero);
                    break;
                }
            }
        }
        System.out.println("Lottorivi on: " + lVoittoNumerot);

        while (true) {

            System.out.print("Haluatko arpoa rivin(k=Kyllä, e=Ei)?: ");
            String sSyote = input.next();
            List<Integer> lArvaus = new ArrayList<>();

            if (sSyote.equals("k")) {
                for (int i = 0; i < 7; i++) {
                    while (true) {
                        int iArvaus = rn.nextInt(40) + 1;
                        if (!lArvaus.contains(iArvaus)) {
                            lArvaus.add(iArvaus);
                            break;
                        }
                    }
                }
                System.out.println("Numerosi ovat: " + lArvaus);
                lArvaus.retainAll(lVoittoNumerot);
                System.out.println("Oikein oli: " + lArvaus);
            }
            if (sSyote.equals("e")) {
                System.out.println("Kiitos ja hei!");
                break;
            }
        }

    }

}