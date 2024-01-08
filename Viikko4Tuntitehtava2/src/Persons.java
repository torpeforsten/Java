import java.lang.reflect.Array;
import java.util.ArrayList;

public class Persons implements iMyCollection {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public Persons() {
    }

    @Override
    public void addMember(Object o) {
        if (persons == null)
            persons = new ArrayList<Person>();
        if (o instanceof Person)
            persons.add((Person) o);
    }

    @Override
    public Object getLastMember() {
        if (persons == null || persons.size() ==0)
            return null;
        else
            return persons.get(persons.size()-1);
    }

    @Override
    public void printAllMember() {
        for (Person p: persons) {
            System.out.println(p);
        }
    }
}
