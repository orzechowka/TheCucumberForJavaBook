package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import support.MyWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


/**
 * Created by Anna on 2017-10-12.
 */
public class WebDriverHooks {

    private final EventFiringWebDriver webDriver;

    public WebDriverHooks(MyWebDriver webDriver) {
        this.webDriver = webDriver;
    }

    @After
    public void finish(Scenario scenario) {
        try {
            byte[] screenshot = webDriver.getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
        } finally {
            webDriver.close();
        }
    }
}
