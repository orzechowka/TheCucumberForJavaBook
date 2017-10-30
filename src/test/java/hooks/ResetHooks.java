package hooks;

import cucumber.api.java.Before;
import nicebank.TransactionQueue;
import org.javalite.activejdbc.Base;

/**
 * Created by Anna on 2017-10-25.
 */
public class ResetHooks {

    @Before
    public void reset() {

        //Base.rollbackTransaction();
        TransactionQueue.clear();
        //BalanceStore.clear();
    }
}
