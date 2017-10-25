package hooks;

import cucumber.api.Transform;
import cucumber.api.java.Before;
import nicebank.BalanceStore;
import nicebank.TransactionQueue;

/**
 * Created by Anna on 2017-10-25.
 */
public class ResetHooks {

    @Before
    public void reset() {
        TransactionQueue.clear();
        BalanceStore.clear();
    }
}
