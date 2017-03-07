/**
 * Created by RENT on 2017-02-09.
 */
public class Osoba {



    String imie;
    String nazwisko;
    String miejsceZamieszkania;





        Osoba (String imie, String nazwisko, String miejsceZamieszkania) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.miejsceZamieszkania = miejsceZamieszkania;

        }
    void opisz() {
        System.out.println("Imię: " + imie + " " + "Nazwisko: " + nazwisko + " " + "Miejsce zamieszkania: " + miejsceZamieszkania + " ");
    }
}

