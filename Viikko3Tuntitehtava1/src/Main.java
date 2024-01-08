import Model.TilausUtils;
import Model.Tilaus;

public class Main {
    public static void main(String[] args) {

        int tilausnro = 123;
        if(TilausUtils.checkTilausnro(tilausnro)){
            Tilaus t1 = new Tilaus(tilausnro, "Saha");
            System.out.println(t1);
        }
        else {
            System.out.println("Tilausnumero virheellinen!");
        }

    }
}