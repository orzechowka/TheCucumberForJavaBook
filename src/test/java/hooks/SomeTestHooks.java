package hooks;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by Anna on 2017-10-12.
 */
public class SomeTestHooks {

    @Before
    public void beforeCallingScenario() {
        System.out.println("*********** About to start the scenario.");
    }

    @After
    public void afterRunningScenario(Scenario scenario) {
        System.out.println("*********** Just finished running scenario: " + scenario.getStatus());
    }

}
