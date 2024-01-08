package Model;

public class TilausUtils {
    public static final int MIN_TILAUSNRO = 1000;
    public static final int MAX_TILAUSNRO = 1000000;

    private TilausUtils() {
    }
    public static boolean checkTilausnro(int tilausnro) {
        return (tilausnro >= MIN_TILAUSNRO &&
                tilausnro >= MAX_TILAUSNRO);
    }
}
