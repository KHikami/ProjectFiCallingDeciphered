package defpackage;

import android.util.Log;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.FutureTask;

/* renamed from: cqq */
final class cqq extends FutureTask {
    private /* synthetic */ cqp a;

    cqq(cqp cqp, Runnable runnable, Object obj) {
        this.a = cqp;
        super(runnable, obj);
    }

    protected final void setException(Throwable th) {
        UncaughtExceptionHandler uncaughtExceptionHandler = this.a.a.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with " + th);
        }
        super.setException(th);
    }
}
