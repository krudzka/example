package hashMapa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created by RENT on 2017-02-16.
 */
public class HashMapMain {
    public static void main(String[] args) {

        Map<Long, String> userToName = new HashMap<>();

        userToName.put(1L, "John");
        userToName.put(2L, "Other");
        userToName.put(3L, "Other");
        System.out.println(userToName.size());
        System.out.println(userToName.get(1L));


        HashSet<String> hash = new HashSet<>();   // iterowanie po hashSecie
        for (String s : hash) {
        }

        for (Long key : userToName.keySet()) { //iterujemy po kluczach
            System.out.println(key);
            System.out.println(userToName.get(key));

        }
        for (String value : userToName.values()) {
            System.out.println(value);
        }
        for (Map.Entry<Long, String> entry : userToName.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }


    }
}
