public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Mikko");
        Person p2 = new Person("Pirjo");
        Person p3 = new Person("Pasi");
        Person p4 = new Person("Kari");

        Persons prs = new Persons();
        prs.addMember(p1);
        prs.addMember(p2);
        prs.addMember(p3);
        prs.addMember(p4);

        System.out.println(prs.getLastMember());
        prs.printAllMember();
    }
}