package p000;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;
import java.util.concurrent.ThreadFactory;

public final class bik implements ThreadFactory {
    final /* synthetic */ int f3432a;
    final /* synthetic */ ConcurrentService f3433b;

    public bik(ConcurrentService concurrentService, int i) {
        this.f3433b = concurrentService;
        this.f3432a = i;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new bil(this, runnable));
    }
}
