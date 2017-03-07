/**
 * Created by RENT on 2017-02-11.
 */
public class Klient extends Osoba {
    String nazwaTowaru;
    double zaplaconaKwota;

    void wypisz() {
        System.out.println("Nazwa towaru: " + nazwaTowaru + " " + " Zapłacona kwota: " + zaplaconaKwota + " ");
        super.opisz();
    }


    Klient(String nazwaTowaru, double zaplaconaKwota, String imie, String nazwisko, String miejsceZamieszkania) {
        super(imie, nazwisko, miejsceZamieszkania);
        //super(nazwisko); tak nie !!
        //super(miejsceZamieszkania);
        this.nazwaTowaru = nazwaTowaru;
        this.zaplaconaKwota = zaplaconaKwota;

    }
}


