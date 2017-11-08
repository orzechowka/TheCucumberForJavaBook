package nicebank;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheCashSlot;


/**
 * Created by Anna on 2017-10-08.
 */
public class CashSlotSteps {

    KnowsTheCashSlot cashSlotHelper;

    public CashSlotSteps(KnowsTheCashSlot cashSlotHelper) {
        this.cashSlotHelper = cashSlotHelper;
    }
    @Then("^\\$(\\d+) should be dispensed$") public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed = ", dollars, cashSlotHelper.getCashSlot().getContents());
    }
}
