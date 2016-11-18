package defpackage;

import java.util.concurrent.Executor;

final class mse {
    static final mse a = new mse(null, null);
    final Runnable b;
    final Executor c;
    mse next;

    mse(Runnable runnable, Executor executor) {
        this.b = runnable;
        this.c = executor;
    }
}
