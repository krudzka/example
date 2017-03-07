/**
 * Created by RENT on 2017-02-15.
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;


    }


}

// tu mozemy stworzyc tylko jeden obiekt  klasy
