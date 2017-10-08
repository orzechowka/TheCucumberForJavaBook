package nicebank;

/**
 * Created by Anna on 2017-10-08.
 */
public class Teller {

    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdrawFrom(Account account, int dollars) {
        cashSlot.dispense(dollars);
    }
}
