package p000;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class oun implements ThreadFactory {
    final /* synthetic */ oum f34315a;

    oun(oum oum) {
        this.f34315a = oum;
    }

    public Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new ouo(this, runnable));
    }
}
