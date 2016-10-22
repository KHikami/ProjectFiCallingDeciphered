package io.grpc.internal;

import cob;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: PG */
public final class bx implements Executor {
    static final Logger a;
    final Queue b;
    boolean c;
    final Object d;
    private final Executor e;
    private final bz f;

    static {
        a = Logger.getLogger(bx.class.getName());
    }

    public bx(Executor executor) {
        this.b = new ArrayDeque(4);
        this.c = false;
        this.f = new bz(this);
        this.d = new by(this);
        cob.b((Object) executor, (Object) "'executor' must not be null.");
        this.e = executor;
    }

    public final void execute(Runnable runnable) {
        Object obj = 1;
        cob.b((Object) runnable, (Object) "'r' must not be null.");
        synchronized (this.d) {
            this.b.add(runnable);
            if (this.c) {
                obj = null;
            } else {
                this.c = true;
            }
        }
        if (obj != null) {
            try {
                this.e.execute(this.f);
            } catch (Throwable th) {
                synchronized (this.d) {
                }
                this.c = false;
            }
        }
    }
}
