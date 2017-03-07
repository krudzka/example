package interfaces;

/**
 * Created by RENT on 2017-02-18.
 */
public class InterfaceMain {

    public static void main(String[] args) {
        Reader intenetReader = new InternetReader();
        HddReader hddReader = new HddReader(); // tu mus byc typ HddReader bo nam nie zadzialaja metody nadpisane w Hddreader
        printPage(hddReader);
        printPage(intenetReader);
        introduce(hddReader);
    }

    public static void printPage(Reader r) {
        System.out.println(r.read());
    }
    public static void introduce (Printable p){
        p.print();
        p.printShort();
    }


}
