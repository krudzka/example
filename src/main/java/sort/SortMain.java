package sort;

import java.util.*;

/**
 * Created by RENT on 2017-02-20.
 */
public class SortMain {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(); //--to posortujemy, hasetu nie posortujemy

        List<User> names = new ArrayList<>();
        names.add(new User("Alicja", "red", 150));
        names.add(new User("Julia", "black", 165));
        names.add(new User("Jan", "brown", 170));
        names.add(new User("John", "blond", 167));
        names.add(new User("Kinga", "black", 152));
        Collections.sort(names, new Comparator<User>() { // komparator wywołujemy jako new
            @Override
            public int compare(User o1, User o2) {
                return o1.getHeight().compareTo(o2.getHeight());
            }
        });

        // Collections.sort(names, Collections.reverseOrder());
        for (User user : names) System.out.println(user);
    }
}
