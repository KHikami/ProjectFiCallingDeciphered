package defpackage;

import android.os.AsyncTask;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: avm */
public class avm {
    final Executor a;

    public AsyncTask a(AsyncTask asyncTask, Object... objArr) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return asyncTask.executeOnExecutor(this.a, objArr);
        }
        String valueOf = String.valueOf(Thread.currentThread());
        throw new IllegalStateException(String.valueOf(new StringBuilder(String.valueOf(valueOf).length() + 50).append("submit method must be called from ui thread, was: ").append(valueOf).toString()));
    }

    public avm(Executor executor) {
        this.a = executor;
    }
}
