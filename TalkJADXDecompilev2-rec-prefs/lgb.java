package p000;

import android.os.StrictMode.ThreadPolicy;
import java.util.concurrent.ThreadFactory;

final class lgb implements ThreadFactory {
    final /* synthetic */ ThreadPolicy f24938a;
    final /* synthetic */ int f24939b;

    lgb(ThreadPolicy threadPolicy, int i) {
        this.f24938a = threadPolicy;
        this.f24939b = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new lgc(this, runnable));
    }
}
