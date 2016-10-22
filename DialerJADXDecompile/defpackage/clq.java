package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: clq */
final class clq implements ThreadFactory {
    clq(clo clo) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new clr(this, runnable), "ClearcutLoggerApiImpl");
    }
}
