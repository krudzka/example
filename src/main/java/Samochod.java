/**
 * Created by RENT on 2017-02-13.
 */
public class Samochod {

    String kolor;
    int przebieg;
    String marka;
    int rokProdukcji;

    Samochod(String kolor, int przebieg, String marka, int rokProdukcji) {
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
    }

    public void wypadek(Samochod s2) {
        System.out.println("Kolor Samochod 1: " + kolor + " Samochod 2: " + kolor);
        System.out.println("Przebieg Samochod 1: " + przebieg + " Samochod 2: " + przebieg);
        System.out.println("Marka Samochod 1: " + marka + " Samochod 2" + marka);
        System.out.println("Rok produkcji Samochod 1: " + rokProdukcji + " Samochod 2: " + rokProdukcji);
    }

    @Override
    public String toString() {
        String value = "Kolor " + kolor + " przebieg " + przebieg + " rok produkcji " + rokProdukcji;
        return value;
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Samochod s = (Samochod) obj;
        if (kolor.equals(s.kolor) &&
                przebieg == s.przebieg &&
                marka.equals(s.marka) &&
                rokProdukcji == s.rokProdukcji) {
            return true;
        }
        return false;
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Samochod samochod = (Samochod) o;

        if (rokProdukcji != samochod.rokProdukcji) return false;
        if (kolor != null ? !kolor.equals(samochod.kolor) : samochod.kolor != null) return false;
        return marka != null ? marka.equals(samochod.marka) : samochod.marka == null;

    }

    @Override
    public int hashCode() {
        int result = kolor != null ? kolor.hashCode() : 0;
        result = 31 * result + (marka != null ? marka.hashCode() : 0);
        result = 31 * result + rokProdukcji;
        return result;
    }

    public static void main(String[] args) {
        Samochod samochod1 = new Samochod("czerwony", 1998657, "Toyota", 1990);
        Samochod samochod2 = new Samochod("biały", 88687575, "Peugot", 2005);
        Samochod a = samochod1;
        Samochod samochod3 = new Samochod("czerwony", 1998657, "Toyota", 1990);
        System.out.println(samochod2);


        samochod1.wypadek(samochod1);
    }
}
