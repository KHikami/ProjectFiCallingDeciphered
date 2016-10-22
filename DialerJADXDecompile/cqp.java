import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class cqp extends ThreadPoolExecutor {
    final /* synthetic */ cqn a;

    public cqp(cqn cqn) {
        this.a = cqn;
        super(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        setThreadFactory(new cqr());
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new cqq(this, runnable, obj);
    }
}
