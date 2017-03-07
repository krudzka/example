/**
 * Created by RENT on 2017-02-09.
 */
public class Kwadrat extends Figura {
    int dlugoscBoku;


    Kwadrat(int dlugoscBoku, String kolor) { // konstruktor
        super(kolor); //odwołanie się do nadklasy
        this.dlugoscBoku = dlugoscBoku;


    }

    public int powierzchnia() {
        return dlugoscBoku * dlugoscBoku;
    }

    public int dlugoscBokow() {
        return 4 * dlugoscBoku;

    }

    public void opisz() {
        System.out.println("Kwadrat: " + dlugoscBoku + " " + kolor);
    }


    public void figura() {
        System.out.println("Kwadrat");
    }


}
