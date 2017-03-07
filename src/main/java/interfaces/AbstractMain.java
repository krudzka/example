package interfaces;

/**
 * Created by RENT on 2017-02-18.
 */
public class AbstractMain {
    public static void main(String[] args) {
        // tak jest jak w klasie podstawowe nie ma metody
        // SomeAbstractClass some= new SomeAbstractClass(){};  // to nie jest obiekt klasy SomeAbstractClass tylko obiekt klasy anonimowej rozszrzerzajacej klase A

        SomeAbstractClass some = new SomeAbstractClass() {
            void example() {

            }

        };       // po tworzeniu obiektu klasy abstrakcyjnej trzeba dac srendik po klamrze
    }
}
