import java.util.Scanner;

/**
 * Created by RENT on 2017-02-13.
 */
public class TestEquals {

    String string1 = "Hello";

    public static void main(String[] args) {
        Samochod samochod = new Samochod("zielony", 123, "Renault", 2015);
        Samochod samochod2 = new Samochod("zielont", 123, "Renault", 2015);
       // System.out.println(samochod.equals(samochod2));
       // System.out.println(samochod.getClass());
       // System.out.println(samochod.equals(new Kwadrat(3, "z")));

       // System.out.println(samochod instanceof Samochod);
        //System.out.println(samochod instanceof Object);


        String a = new String("Hello");
        String b = new String("Hello");
        TestEquals testEquals = new TestEquals();
        //  System.out.println(a.equals(b));

        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        System.out.println(i);




    }
}
