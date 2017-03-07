package homework1;

/**
 * Created by RENT on 2017-02-15.
 */
public class InternetReader extends Reader {
    public InternetReader(String url) {

        super(url);
    }

    @Override
    protected String read() {
        return "Czytam z internetu + " + url;
    }
}

