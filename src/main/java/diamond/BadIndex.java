package diamond;

/**
 * Created by RENT on 2017-02-18.
 */
class BadIndex extends RuntimeException {

    private int size;
    private int askedIndex;

    public BadIndex (int size, int askedIndex){
        this.size=size;
        this.askedIndex=askedIndex;
    }

    @Override public String getMessage (){
        return "You asked for " + askedIndex + "but size is " + size;
    }
}
