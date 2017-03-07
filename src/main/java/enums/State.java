package enums;

/**
 * Created by RENT on 2017-02-20.
 */
public enum State {
    DISABLED("Disabled"), ENABLED("Enabled"), TRIAL("Trial"), WAITING_FOR_DATA("Waiting for data"), EXPIRED_TRIAL("Expected trial");

    State(String name) {
        this.name = name;
    }

    private String name;


    public static State getName(State n) {
        State name[] = State.values(); // ta linijka jest w sumie zbedna bo ta tablica sie tworzy automatycznie
        for (int i = 0; i < State.values().length; i++) {
            if (name[i].name.equals(n))
                return name[i];

        }
        throw new UnsupportedOperationException();
    }
}

