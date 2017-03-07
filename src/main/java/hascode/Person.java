package hascode;

/**
 * Created by RENT on 2017-02-15.
 */
public class Person {
    private String name;
    private int age;
    private String pesel;

    public Person(String name, int age, String pesel) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;

    }

    public boolean equals(Object o) {
        if (o == this) return true; // sprawdzamy czy nie porownujemy tego samego obiektu ztym samym obiektem

        if (o instanceof Person) {
            Person p = (Person) o;
            boolean nameEquals = this.name.equals(p.name);
            boolean peselEquals = this.pesel.equals(p.pesel);
            boolean ageEquals = this.age==p.age;
            return nameEquals && peselEquals && ageEquals;

        } else return false;

    }
    public int hashCode(){
        int hashCode = name.hashCode();
        hashCode =hashCode()+ 32*pesel.hashCode();
        hashCode= hashCode() + age;
        return hashCode;
    }
}
