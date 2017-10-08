package nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import support.KnowsTheDomain;
import transforms.MoneyConverter;

/**
 * Created by Anna on 2017-10-08.
 */
public class AccountSteps {

    KnowsTheDomain helper;

    public AccountSteps(KnowsTheDomain helper) {
        this.helper = helper;
    }

    @Given("^I have deposited (\\$\\d+\\.\\d+) in my account$")
    public void iHaveDeposited$InMyAccount(@Transform(MoneyConverter.class) Money amount) throws Throwable {
        helper.getMyAccount().deposit(amount);
        Assert.assertEquals("Incorrect account balance -", amount, helper.getMyAccount().getBalance());
    }
}
