import object.User;

/**
 * Created by RENT on 2017-02-14.
 */
public class Main1 {
    public static void main(String[] args) {
        new Main1().start();
    }
    public void start(){
        User u = new User();
        u.name="test";
        u.surname="test";
        testUser(u);
    }
    public void testUser(Object o){
        System.out.println(o.hashCode());
        if(o instanceof User){
            User user=(User) o;
            System.out.println(user.name);
        }
    }
}
