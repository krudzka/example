package iterable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by RENT on 2017-02-20.
 */
public class Iterable {
    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();
        for (
                Object o : new ArrayList<>())

        {

        }

        Iterator<String> iterator = strings.iterator();// daj mi iterator
        String current;
        while (iterator.hasNext())

        {
            current = iterator.next();
        }
    }
}
