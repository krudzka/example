/**
 * Created by RENT on 2017-02-07.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int a = 3;
        int b = 9;
        int c = a + b;
        int d = a * b;
        double e = a % b;
        double f = (double) a / b;

        int zmienna = 0;
        int age1 = 3;
        int age2 = 6;

        if (age1 > age2) {
            zmienna = 1;
        } else

        {
            zmienna = 2;
        }


        int levels = 6;

        for (int x = 0; x < levels; x++) {

            for (int y = 0; y <= x; y++)
                System.out.print('*');
            System.out.println("");
        }

        int z = 5;
       /* switch (z) {
            case 1:
            case 2:
            case 3:
                System.out.println("0-3");
                break;
            case 4:
            case 5:
                System.out.println("5-6");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(">6");
                break;
            default:
                System.out.println(">9");
                */

        if (z > 0 & z <= 3) {
            System.out.println("1-3");
        }

        if (z > 3 & z <= 5) {
            System.out.println("4-5");
        }



    }
}









