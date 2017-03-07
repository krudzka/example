package petla;

/**
 * Created by RENT on 2017-02-21.
 */
public class Petla {
    static {
        System.out.println(max_list(new int[]{1, 2, 3, 5, 4, 3}));
    }


    public static int max_list(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            max = ar[i] > max ? max = ar[i] : max; // skrocony zapis if'a
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

}

