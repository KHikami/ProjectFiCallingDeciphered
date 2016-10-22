package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: lfz */
final class lfz implements ThreadFactory {
    lfz() {
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(new lga(this, runnable));
    }
}
