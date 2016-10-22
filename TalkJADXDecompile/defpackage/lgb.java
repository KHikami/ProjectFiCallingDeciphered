package defpackage;

import android.os.StrictMode.ThreadPolicy;
import java.util.concurrent.ThreadFactory;

/* renamed from: lgb */
final class lgb implements ThreadFactory {
    final /* synthetic */ ThreadPolicy a;
    final /* synthetic */ int b;

    lgb(ThreadPolicy threadPolicy, int i) {
        this.a = threadPolicy;
        this.b = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new lgc(this, runnable));
    }
}
