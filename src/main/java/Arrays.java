/**
 * Created by RENT on 2017-02-08.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] names = new int[3];
        names[0] = 1;
        names[1] = 2;
        names[2] = 3;

        //lub

        int[] names1 = {2, 3, 7, 18};
        for (int i = 0; i < names1.length; i++) {
            boolean isFirstHalf = i < names1.length / 2;
            int current = names1[i];
            boolean isEven = current % 2 == 0;
            if (isFirstHalf && isEven) {
                System.out.println(current);
            }
            if (!isFirstHalf && !isEven) {
                System.out.println(current);
            }
        }

        for (int current : names1) {
            boolean isEven = current % 2 ==0;
            if (isEven) System.out.println(current);
            if (!isEven) System.out.println(current);
        }

    }
}
