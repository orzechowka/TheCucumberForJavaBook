package support;

import nicebank.Account;
import nicebank.Teller;
import nicebank.CashSlot;

/**
 * Created by Anna on 2017-10-08.
 */
public class KnowsTheDomain {

    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;


    public Account getMyAccount() {
        if (myAccount == null) {
            myAccount = new Account();
        }
        return myAccount;
    }

    public CashSlot getCashSlot() {
        if (cashSlot == null) {
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

    public Teller getTeller() {
        if (teller == null) {
            teller = new Teller(getCashSlot());
        }
        return teller;
    }
}
