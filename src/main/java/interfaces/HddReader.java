package interfaces;

import homework1.*;

/**
 * Created by RENT on 2017-02-18.
 */
public class HddReader implements Reader, Printable {

    @Override
    public String read() {
        return "Hdd reading";
    }

    @Override
    public void print() {
        System.out.println("I'm hdd reader");

    }

    @Override
    public void printShort() {
        System.out.println("hdd");

    }
}
