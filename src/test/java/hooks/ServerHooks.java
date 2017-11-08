package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import nicebank.AtmServer;
import support.KnowsTheAccount;
import support.KnowsTheCashSlot;

/**
 * Created by Anna on 2017-10-12.
 */
public class ServerHooks {

    public static final int PORT = 8887;
    private AtmServer server;
    private KnowsTheAccount accountHelper;
    private KnowsTheCashSlot cashSlotHelper;

    public ServerHooks(KnowsTheAccount accountHelper, KnowsTheCashSlot cashSlotHelper) {
        this.accountHelper = accountHelper;
        this.cashSlotHelper = cashSlotHelper;
    }

    @Before
    public void startServer() throws Exception {
        server = new AtmServer(PORT, cashSlotHelper.getCashSlot(), accountHelper.getMyAccount());
        server.start();
    }

    @After
    public void stopServer() throws Exception {
        server.stop();
    }

}
