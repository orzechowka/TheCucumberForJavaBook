package nicebank;

/**
 * Created by Anna on 2017-10-08.
 */
public class AutomatedTeller implements Teller {

    private CashSlot cashSlot;

    public AutomatedTeller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) {
        account.debit(dollars);
        cashSlot.dispense(dollars);
    }
}
