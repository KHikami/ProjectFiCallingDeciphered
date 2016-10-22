package io.grpc.internal;

import bm;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class cs implements Executor {
    static final Logger a;
    final Queue<Runnable> b;
    boolean c;
    final Object d;
    private final Executor e;
    private final cu f;

    static {
        a = Logger.getLogger(cs.class.getName());
    }

    public cs(Executor executor) {
        this.b = new ArrayDeque(4);
        this.c = false;
        this.f = new cu(this);
        this.d = new ct(this);
        bm.a((Object) executor, (Object) "'executor' must not be null.");
        this.e = executor;
    }

    public void execute(Runnable runnable) {
        Object obj = 1;
        bm.a((Object) runnable, (Object) "'r' must not be null.");
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
