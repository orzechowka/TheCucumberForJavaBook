package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import nicebank.TransactionProcessor;

/**
 * Created by Anna on 2017-10-25.
 */
public class BackgroundProcessHooks {

    private Thread transactionProcessorThread;

    @Before
    public void startBackgroundThread() {
        transactionProcessorThread = new Thread() {
            public void run() {
                TransactionProcessor processor = new TransactionProcessor();
                processor.process();
            }
        };

        transactionProcessorThread.start();
    }

    @After
    public void stopBackgroundThread() {
        transactionProcessorThread.interrupt();
    }
}
