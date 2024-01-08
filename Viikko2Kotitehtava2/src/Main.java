public class Main {
    public static void main(String[] args) {

        Auto a1 = new Auto("ABC-123", "Volvo", "v70");
        a1.setVuosimalli(1875);
        System.out.println(a1);

        Auto a2 = new Auto();
        a2.kysyTiedot();
        System.out.println(a2);

    }
}