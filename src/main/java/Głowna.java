/**
 * Created by RENT on 2017-02-11.
 */
public class Głowna {
    public static void main(String[] args) {
        Klient klient = new Klient ("rower", 10,"Jan", "kowalski","wroc");
        klient.wypisz();
        Pracownik pracownik = new Pracownik (7,14,"Jan", "kowalski","wroc");
        pracownik.opisz1();

    }
}

