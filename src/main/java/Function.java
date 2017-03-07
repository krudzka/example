/**
 * Created by RENT on 2017-02-08.
 */
public class Function {
    int a = 12;

    public static void main(String[] args) {
        int[] digits = {1, 2, 3, 4, 5, 6, 7};
        for (int digit : digits) {
            if (isEven(digit)) System.out.println(digit);
        }


    }

    static boolean isEven(int digit) {
        return digit % 2 == 0;
    }
}

