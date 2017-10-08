package support;

import nicebank.Account;
import nicebank.Steps;
import nicebank.Teller;
import nicebank.CashSlot;

/**
 * Created by Anna on 2017-10-08.
 */
public class KnowsMyAccount {
    private Steps steps;
    private Account myAccount;
    private CashSlot cashSlot;
    private Teller teller;

    public KnowsMyAccount(Steps steps) {
        this.steps = steps;
    }

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
