package nicebank;

/**
 * Created by Anna on 2017-10-08.
 */
public class CashSlot {

    private int contents;

    public int getContents() {
        return contents;
    }

    public void dispense(int dollars) {
        contents = dollars;
    }
}
