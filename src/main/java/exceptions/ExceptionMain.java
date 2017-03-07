package exceptions;

/**
 * Created by RENT on 2017-02-18.
 */
public class ExceptionMain {
    public static void main(String[] args) {
        try{
       some();

    }catch (Exception e ){
            System.out.println("wyjatek");
    } finally {
            System.out.println("finally");
        }
        System.out.println("!!!!!!!!!!");
    }

    public static void some(){
        String s =null;
        s.toLowerCase();
    }

}
