package defpackage;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.util.concurrent.ThreadFactory;

/* renamed from: bik */
public final class bik implements ThreadFactory {
    final /* synthetic */ int a;
    final /* synthetic */ ConcurrentService b;

    public bik(ConcurrentService concurrentService, int i) {
        this.b = concurrentService;
        this.a = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new bil(this, runnable));
    }
}
