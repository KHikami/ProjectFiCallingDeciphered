package p000;

import java.util.concurrent.ThreadFactory;

final class hde implements ThreadFactory {
    final /* synthetic */ hdc f16687a;

    hde(hdc hdc) {
        this.f16687a = hdc;
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new hdf(this, runnable), "ClearcutLoggerApiImpl");
    }
}
