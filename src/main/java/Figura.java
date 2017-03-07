/**
 * Created by RENT on 2017-02-09.
 */
public abstract class Figura {
    String kolor ;
    Figura(String kolor){ //konstruktor
        this.kolor=kolor;
    }

    public void opisz() {
        System.out.println("Figura - kolor " + kolor);
    }

    public abstract void figura();
}
