package support;
import nicebank.CashSlot;
/**
 * Created by Anna on 2017-11-08.
 */
public class KnowsTheCashSlot {

    private CashSlot cashSlot;
    public CashSlot getCashSlot() {
        if (cashSlot == null){
            cashSlot = new CashSlot();
        }
        return cashSlot;
    }

}
