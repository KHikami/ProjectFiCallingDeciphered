package defpackage;

import java.util.concurrent.Executor;

/* renamed from: mse */
final class mse {
    static final mse a;
    final Runnable b;
    final Executor c;
    mse next;

    static {
        a = new mse(null, null);
    }

    mse(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
