import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class btc {
    static final ExecutorService a;

    static {
        a = Executors.newFixedThreadPool(2, new cml("GAC_Executor"));
    }
}
