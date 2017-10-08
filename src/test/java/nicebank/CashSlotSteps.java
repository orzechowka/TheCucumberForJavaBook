package nicebank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheDomain;

/**
 * Created by Anna on 2017-10-08.
 */
public class CashSlotSteps {

    KnowsTheDomain helper;

    public CashSlotSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Then("^\\$(\\d+) should be dispensed$") public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed = ", dollars, helper.getCashSlot().getContents());
    }
}
