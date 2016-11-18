package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class oun implements ThreadFactory {
    final /* synthetic */ oum a;

    oun(oum oum) {
        this.a = oum;
    }

    public Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new ouo(this, runnable));
    }
}
