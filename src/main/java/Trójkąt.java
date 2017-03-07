/**
 * Created by RENT on 2017-02-09.
 */
public class Trójkąt extends Figura {


    int dlugoscBoku;
    int wysokosc;

    Trójkąt(int dlugoscBoku, int wysokosc, String kolor) {
        super(kolor);
        this.dlugoscBoku = dlugoscBoku;
        this.wysokosc = wysokosc;
    }

    public double powierzchnia() {
        return (dlugoscBoku * wysokosc) / 2;
    }

    public void figura() {
        System.out.println("Trojkat");
    }

    public void opisz() {
        System.out.println("Trójkąt: " + dlugoscBoku + " " + wysokosc + " " + kolor);
    }

}
