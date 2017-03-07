package hascode;

import object.User;

import java.util.HashSet;

/**
 * Created by RENT on 2017-02-15.
 */
public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person ("Julia", 21, "9876546987");
        Person p2 = new Person ("Julia", 21, "9876546987");
        HashSet<Person> persons = new HashSet<>();
        persons.add(p);
        persons.add(p2);
       for(Person person : persons) {
       }

        System.out.println(p.equals(p2));


    }
}
