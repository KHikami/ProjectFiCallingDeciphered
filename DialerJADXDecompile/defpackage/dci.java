package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: dci */
final class dci {
    static final dci a;
    final Runnable b;
    final Executor c;
    dci next;

    static {
        a = new dci(null, null);
    }

    private dci(Runnable runnable, Executor executor) {
        this.b = null;
        this.c = null;
    }
}
