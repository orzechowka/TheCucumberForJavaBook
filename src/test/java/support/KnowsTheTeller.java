package support;

import nicebank.Account;
import nicebank.Teller;

/**
 * Created by Anna on 2017-11-08.
 */
public class KnowsTheTeller {

    private final AtmUserInterface atmUserInterface;

    public KnowsTheTeller(AtmUserInterface atmUserInterface) {
        this.atmUserInterface = atmUserInterface;
    }

    public Teller getTeller() {
        return atmUserInterface;
    }
}
