public class Main {
    public static void main(String[] args) {
//        Auto a1; // a1 = null tässä vaiheessa
//        a1 = new Auto();
//        System.out.println(a1);
//
//        Auto a2 = new Auto("ABC-123", "Volvo");
//        System.out.println(a2);
//
//        Auto a3 = new Auto();
//        a3.setRekno("VZC-123luhui");
//        System.out.println(a3);

        Henkilo h1 = new Henkilo();
        System.out.println(h1);

        Henkilo h2 = new Henkilo("mIKKO", "mUIKKU", "131200", 1.77, 94);
        System.out.println(h2);

        Henkilo h3 = new Henkilo("Roope", "Forstén", "131200A661C", 1.85 , 126.3);
        System.out.println(h3);
    }
}