package args;

/**
 * Created by RENT on 2017-02-18.
 */
public class ArgsMain {

    public static final int PATH_FOLDER = 0;

    public static void main(String[] args) {
        String pathToListenFolder = args[PATH_FOLDER];
        System.out.println(args.length);          // odpalamy to dla argumentow podanych w mainie w edit configuration
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);

        }

    }
}
