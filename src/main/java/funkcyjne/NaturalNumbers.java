package funkcyjne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-23.
 */
public class NaturalNumbers {
    public static final int ZERO = 0;

    public static int next(int previous) {
        return previous + 1;
    }

    public static List<Integer> take(int count) {
        return doTake(emptyList(), count);

    }

    private static List<Integer> doTake(
            List<Integer> accumulator, int count) {
        if (count == ZERO) {
            System.out.println(accumulator);
            return accumulator;
        } else {
            System.out.println(accumulator);
            return doTake(list(next(count - 1), accumulator), count - 1);
        }
    }

    private static List list(int i, List list) {
        list = new ArrayList(list);
        list.add(i);
        return list;
    }
    private static List emptyList(){
        return new ArrayList();
    }


    public static void main(String[] args) {
        System.out.println(NaturalNumbers.take(20));
    }
}
