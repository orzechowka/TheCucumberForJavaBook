package nicebank;

import cucumber.api.java.en.When;
import support.KnowsTheAccount;
import support.KnowsTheTeller;
/**
 * Created by Anna on 2017-10-08.
 */
public class TellerSteps {

    KnowsTheAccount accountHelper;
    KnowsTheTeller tellerHelper;

    public TellerSteps(KnowsTheTeller tellerHelper, KnowsTheAccount accountHelper) {
        this.tellerHelper = tellerHelper;
        this.accountHelper = accountHelper;
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int amount) throws Throwable {
        tellerHelper.getTeller().withdrawFrom(accountHelper.getMyAccount(), amount);
    }
}
