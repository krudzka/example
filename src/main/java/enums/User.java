package enums;

/**
 * Created by RENT on 2017-02-20.
 */
public class User {
    private String name;
    private State state = State.DISABLED;

    public boolean isTrue() {
        return state != State.DISABLED;
    }


    public static void main(String[] args) {

        String stateAsEnum = "DISABLED";
        State enumByEnum = State.valueOf("fhjfk");
    }
}
