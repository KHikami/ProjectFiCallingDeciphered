package p000;

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
    private static final ThreadFactory f17400a = new ip();
    private static final BlockingQueue<Runnable> f17401b = new LinkedBlockingQueue(10);
    public static final Executor f17402c;
    private static it f17403h;
    private static volatile Executor f17404i;
    final iv<Params, Result> f17405d = new iv(this);
    final FutureTask<Result> f17406e = new iq(this, this.f17405d);
    volatile int f17407f = iu.f19021a;
    final AtomicBoolean f17408g = new AtomicBoolean();

    protected abstract Result mo3026a(Params... paramsArr);

    static {
        Executor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f17401b, f17400a);
        f17402c = threadPoolExecutor;
        f17404i = threadPoolExecutor;
    }

    private static Handler m21123b() {
        Handler handler;
        synchronized (io.class) {
            if (f17403h == null) {
                f17403h = new it();
            }
            handler = f17403h;
        }
        return handler;
    }

    Result m21128c(Result result) {
        io.m21123b().obtainMessage(1, new is(this, result)).sendToTarget();
        return result;
    }

    protected void mo3027a(Result result) {
    }

    protected void m21125a() {
    }

    protected void mo3028b(Result result) {
    }
}
