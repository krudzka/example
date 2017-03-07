import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by RENT on 2017-02-09.
 */
public class Test {
    public static void main(String[] args) {
        //  Figura figura = new Figura ("czerwony");
        //figura.opisz();

        Figura kwadrat1 = new Kwadrat(4, "zielony");
        kwadrat1.opisz();
        Figura kwadrat2 = new Kwadrat(9, "czerwony");
        Figura trojkat = new Trójkąt(4, 6, "biały");
        Figura trojkat1 = new Trójkąt(5, 7, "niebieski");

        //Kwadrat figkwadrat = (Kwadrat) figura; tak sie nie da bo nie da sie skastowac (rzutowany) figury do kwadratu da sie tylko odwrotnie
        //  figkwadrat.opisz();

        Kwadrat prawdziwykwadrat = (Kwadrat) kwadrat1;
        Kwadrat kwadrat22 = (Kwadrat) kwadrat2;
        Kwadrat a = (Kwadrat) kwadrat1;
        prawdziwykwadrat.opisz();
        Trójkąt prawdziwy = (Trójkąt) trojkat;

        ArrayList<Kwadrat> lista = new ArrayList<Kwadrat>();
        lista.add(a);
        lista.add(prawdziwykwadrat);
        lista.add(kwadrat22);

        a.dlugoscBoku = 5;

        for (int i = 0; i < lista.size(); i++) {
            Kwadrat kwa = lista.get(i);
            kwa.opisz();
            System.out.println("Rozmiar listy: " + lista.size());
        }
        for (Kwadrat kw : lista) {
            kw.opisz();
        }
        ArrayList<Figura> lista4 = new ArrayList<>();
        lista4.add(trojkat);
        lista4.add(trojkat1);
        lista4.add(prawdziwy);
        lista4.add(kwadrat22);
        lista4.add(kwadrat1);

        for (int i = 0; i < lista4.size(); i++) {
            Figura figi = lista4.get(i);
            figi.opisz();

        }

        ArrayList<Trójkąt> lista5 = new ArrayList<>();
        lista5.add(prawdziwy);

        ArrayList<Integer> listaIntow = new ArrayList<Integer>();
        ArrayList<Double> listaDouble = new ArrayList<Double>();
        ArrayList<Character> listaChar = new ArrayList<Character>();
        ArrayList<Boolean> listaBooli = new ArrayList<Boolean>();
        int l = 1;
        int g = 5;
        int c = 7;
        Integer integeri = 3;
        //lub
        Integer integer = new Integer(3);


        listaIntow.add(l);
        listaIntow.add(g);
        listaIntow.add(c);
        int max = listaIntow.get(0);


    }
}


//
//
//
//            HashSet<Kwadrat> hashSet = new HashSet<>();
//            hashSet.add(a);
//            hashSet.add(prawdziwykwadrat);
//            System.out.println("Rozmiar zbioru: " + hashSet.size());
//
//
//            for (Kwadrat kwad : hashSet) {
//                kwad.dlugoscBoku = 4;
//                kwad.opisz();
//            }
//
//            //  String jajka;
//            // String mleko;
//            //String chleb;
//            ArrayList<String> lista2 = new ArrayList<String>();
//            lista2.add("mleko");
//            lista2.add("jajka");
//            lista2.add("chleb");
//
//            for (int i = 0; i < lista2.size(); i++) {
//                String listaZakupow = lista2.get(i);
//                System.out.println(listaZakupow);
//
//            }
//            for (String zakupy : lista2) {
//                System.out.println(zakupy);
//            }
//
//            Trójkąt trójkąt = new Trójkąt(2, 4, "czerwony");
//            System.out.println(trójkąt.powierzchnia());
//            Trójkąt trójkąt1 = new Trójkąt(3, 9, "pomarańczowy");
//            System.out.println(trójkąt1.powierzchnia());
//
//            List<Trójkąt> lista1 = new ArrayList<Trójkąt>();// lista
//            Figura k = new Kwadrat(5, "żółty"); //inicjujemy pole typu figura i tworzymy w nim nowy obiekt typu kwadrat (domyslny konstruktor)
//            Kwadrat kwadrat = (Kwadrat) k; //rzutowanie obiektow
//            //  k.kolor = "czerwony";  //odwołujemy się do pola klasy kwadrat, nadajemy wartosc atrybutu , teraz juz nie bo mam wywolany w konstruktorze
//            int pow = kwadrat.powierzchnia();
//            kwadrat.powierzchnia();
//            kwadrat.opisz();
//
//            System.out.println(k.kolor);
//
//            char litera = k.kolor.charAt(3);
//            char literaDruga = k.kolor.charAt(4);
//            System.out.println(pow);
//            System.out.print(litera);
//            System.out.println(literaDruga);
//            // lub
//
//            String wycinek = k.kolor.substring(3, 5);
//            System.out.println(wycinek);
//
//
//            //Osoba osoba;
//            //osoba = new Osoba();
//            //osoba.imie = "Karolina";
//            //osoba.nazwisko = "Rudzka";
//




