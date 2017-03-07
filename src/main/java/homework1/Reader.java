package homework1;

/**
 * Created by RENT on 2017-02-15.
 */
public abstract class Reader {
    protected String url;

    public Reader(String url) {

        this.url = url;
    }

    public String getPage() {
        System.out.println(read());
        System.out.println("Parsing");
        return "web page";

    }

    protected abstract String read();
}
