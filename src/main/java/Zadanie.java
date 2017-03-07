import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zadanie {


    int zwracaj(ArrayList<Integer> parametr) {
        int max = parametr.get(0);

        for (int i = 0; i < parametr.size(); i++) {
            if (parametr.get(i) > max) {
                max = parametr.get(i);


            }


        }
        System.out.println(max);
        return max;

    }

    public static void main(String[] args) {
        Zadanie zadanie = new Zadanie();
        ArrayList<Integer> parametr = new ArrayList<>();


        parametr.add(187);
        parametr.add(11);
        parametr.add(7);
        zadanie.zwracaj(parametr);
    }
}


