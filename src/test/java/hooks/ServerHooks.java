package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import nicebank.AtmServer;
import support.KnowsTheAccount;
import nicebank.CashSlot;

/**
 * Created by Anna on 2017-10-12.
 */
public class ServerHooks {

    public static final int PORT = 8887;
    private AtmServer server;
    private KnowsTheAccount accountHelper;
    private CashSlot cashSlot;

    public ServerHooks(KnowsTheAccount accountHelper, CashSlot cashSlot) {
        this.accountHelper = accountHelper;
        this.cashSlot = cashSlot;
    }

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, cashSlot, accountHelper.getMyAccount());
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }

}
