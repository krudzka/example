package statyczne;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-14.
 */
public class User {
    public final static String DEFAULT_NAME = "No name";
    public static List<String> DEFAULT_NAMES;

    static {
        DEFAULT_NAMES = new ArrayList<>();
        DEFAULT_NAMES.add("No name 1");
        DEFAULT_NAMES.add("No name 2");

    }

    public String name;
    public String surname;
    public int age;

    public String getName() {
        MathOperations.add(1, 2);
        return name == null ? DEFAULT_NAME : name;
    }
}

class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }
}

