package nicebank;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import support.KnowsTheAccount;
import transforms.MoneyConverter;

/**
 * Created by Anna on 2017-10-08.
 */
public class AccountSteps {

    KnowsTheAccount accountHelper;

    public AccountSteps(KnowsTheAccount accountHelper) {
        this.accountHelper = accountHelper;
    }

    @Given("^my account has been credited with (\\$\\d+\\.\\d+)$")
    public void myAccountHasBeenCreditedWith$(
            @Transform(MoneyConverter.class) Money amount)
            throws Throwable {
        accountHelper.getMyAccount().credit(amount);
    }

    @Then("^the balance of my account should be (\\$\\d+\\.\\d+)$")
    public void theBalanceOfMyAccountShouldBe$(
            @Transform(MoneyConverter.class) Money amount) throws Throwable {
        int timeoutMilliSecs = 3000;
        int pollIntervalMilliSecs = 100;

        while (!accountHelper.getMyAccount().getBalance().equals(amount)
                && timeoutMilliSecs > 0){
            Thread.sleep(pollIntervalMilliSecs);
            timeoutMilliSecs -= pollIntervalMilliSecs;
        }

        Assert.assertEquals(
                "Incorrect account balance -",
                amount,
                accountHelper.getMyAccount().getBalance());
    }

}
