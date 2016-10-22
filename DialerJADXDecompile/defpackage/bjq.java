package defpackage;

import android.util.Log;
import com.google.android.apps.dialer.provider.DialerProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* renamed from: bjq */
public final class bjq implements Callable {
    public volatile FutureTask a;
    private final Callable b;
    private /* synthetic */ DialerProvider c;

    public bjq(DialerProvider dialerProvider, Callable callable) {
        this.c = dialerProvider;
        this.a = null;
        this.b = callable;
    }

    public final Object call() {
        if (Log.isLoggable("DialerProvider", 2)) {
            String str = "Future called for ";
            String valueOf = String.valueOf(Thread.currentThread().getName());
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                valueOf = new String(str);
            }
        }
        Object call = this.b.call();
        if (this.a != null) {
            synchronized (this.c.b) {
                this.c.b.remove(this.a);
            }
            this.a = null;
        }
        return call;
    }
}
