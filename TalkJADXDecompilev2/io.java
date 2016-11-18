package defpackage;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class io<Params, Progress, Result> {
    private static final ThreadFactory a = new ip();
    private static final BlockingQueue<Runnable> b = new LinkedBlockingQueue(10);
    public static final Executor c;
    private static it h;
    private static volatile Executor i;
    final iv<Params, Result> d = new iv(this);
    final FutureTask<Result> e = new iq(this, this.d);
    volatile int f = iu.a;
    final AtomicBoolean g = new AtomicBoolean();

    protected abstract Result a(Params... paramsArr);

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, b, a);
        c = threadPoolExecutor;
        i = threadPoolExecutor;
    }

    private static Handler b() {
        Handler handler;
        synchronized (io.class) {
            if (h == null) {
                h = new it();
            }
            handler = h;
        }
        return handler;
    }

    Result c(Result result) {
        io.b().obtainMessage(1, new is(this, result)).sendToTarget();
        return result;
    }

    protected void a(Result result) {
    }

    protected void a() {
    }

    protected void b(Result result) {
    }
}
