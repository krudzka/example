import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Baza {
    ArrayList<Film> baza ;
    Baza() {
        baza = new ArrayList<>();
    }


    public void wypisz() {
        for (Film f : baza) {
            //f.opisz(); -- gdybvysmy pobierali metode z klasy film
            System.out.println("Film: " + f.nazwaFilmu + " " + f.ocena);
        }


    }

    public void dodaj(Film film) {
        baza.add(film);


    }

    public void usuń(Film film) {
        baza.remove(film);

    }


    public static void main(String[] args) {
        Baza bazaFilmow = new Baza();
        Film film1 = new Film("Titanic", 5);
        Film film2 = new Film("Harry Potter", 4);
        Film film3 = new Film("Alicja", 7);
        Film film4 = new Film("Hobbit", 6);


        bazaFilmow.dodaj(film1);
        bazaFilmow.dodaj(film2);
        bazaFilmow.dodaj(film3);
        bazaFilmow.dodaj(film4);
        bazaFilmow.wypisz();
        System.out.println("xxxxxxxxxxxxxxxxxxxxx");
        bazaFilmow.usuń(film4);
        bazaFilmow.wypisz();


    }
}




