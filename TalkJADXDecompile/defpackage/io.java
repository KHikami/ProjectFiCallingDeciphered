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

/* renamed from: io */
abstract class io<Params, Progress, Result> {
    private static final ThreadFactory a;
    private static final BlockingQueue<Runnable> b;
    public static final Executor c;
    private static it h;
    private static volatile Executor i;
    final iv<Params, Result> d;
    final FutureTask<Result> e;
    volatile int f;
    final AtomicBoolean g;

    protected abstract Result a(Params... paramsArr);

    static {
        a = new ip();
        b = new LinkedBlockingQueue(10);
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

    public io() {
        this.f = iu.a;
        this.g = new AtomicBoolean();
        this.d = new iv(this);
        this.e = new iq(this, this.d);
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
