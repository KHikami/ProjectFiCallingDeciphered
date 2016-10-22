import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

final class ixz {
    static final ScheduledExecutorService a;

    static {
        a = new iyg(new ScheduledThreadPoolExecutor(2, new iya(), ixx.b), ixx.a);
    }
}
