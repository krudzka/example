package homework1;

/**
 * Created by RENT on 2017-02-15.
 */
public class HddReader extends Reader {

    public HddReader(String url) {
        super(url);
    }

    @Override
    protected String read() {
        return "Czytam z Hdd strone + " + url;
    }
}
