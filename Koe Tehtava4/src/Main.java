public class Main {
    public static void main(String[] args) {
        Sukset s1 = new Sukset(20, "1.3.2023", 200, "Lennäkuuseen");
        Monot m1 = new Monot(20, "1.3.2023", 45, 10);
        Sauvat sa1 = new Sauvat(10, "1.3.2023", 150);
        Kypara k1 = new Kypara(15, "1.3.2023", 12, "Pinkki");

        Paketti p1 = new Paketti(s1, m1, sa1, k1);
        System.out.println(p1.toString());

    }
}