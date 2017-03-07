/**
 * Created by RENT on 2017-02-11.
 */
public class Pracownik extends Osoba {

    double stawkaGodzinowa;
    double liczbaGodzin;
    double pensja;


    Pracownik(double stawkaGodzinowa, double liczbaGodzin, String imie, String nazwisko, String miejsceZamieszkania) {
        super(imie, nazwisko, miejsceZamieszkania);
        //super(nazwisko); tak nie !!
        //super(miejsceZamieszkania);
        this.stawkaGodzinowa = stawkaGodzinowa;
        this.liczbaGodzin = liczbaGodzin;

    }

    public void opisz1() {
        pensja=stawkaGodzinowa*liczbaGodzin;
        System.out.println("Pensja: " + pensja + " ");

       // super.opisz(); zeby sie nie dublowało imie i nazwisko
    }

}


