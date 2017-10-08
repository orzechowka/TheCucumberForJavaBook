package nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import support.KnowsMyAccount;
import transforms.MoneyConverter;

/**
 * Created by Anna on 2017-10-08.
 */
public class Steps {

    KnowsMyAccount helper;

    public Steps() {
        helper = new KnowsMyAccount(this);
    }


    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }

    @When("^I withdraw \\$(\\d+)$")
    public void iWithdraw$(int amount) throws Throwable {
        helper.getTeller().withdrawFrom(helper.getMyAccount(), amount);
    }

    @Then("^\\$(\\d+) should be dispensed$") public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed = ", dollars, helper.getCashSlot().getContents());
    }

}
