package support;

import hooks.ServerHooks;
import nicebank.Account;
import nicebank.Teller;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

/**
 * Created by Anna on 2017-10-12.
 */
public class AtmUserInterface implements Teller {

    private final EventFiringWebDriver webdriver;

    public AtmUserInterface(EventFiringWebDriver webdriver) {
        this.webdriver = webdriver;
    }

    public void withdrawFrom(Account account, int dollars) {
        try {
            webdriver.get("http://localhost:" + ServerHooks.PORT);
            webdriver.findElement(By.id("amount")).sendKeys(String.valueOf(dollars));
            webdriver.findElement(By.id("withdraw")).click();
        } finally {
            webdriver.close();
        }
    }
}
