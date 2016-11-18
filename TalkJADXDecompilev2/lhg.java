package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class lhg implements Executor {
    static final Logger a = Logger.getLogger(lhg.class.getName());
    final Deque<Runnable> b = new ArrayDeque();
    boolean c = false;
    int d = 0;
    final Object e = new Object();
    private final Executor f;

    public lhg(Executor executor) {
        this.f = (Executor) bm.a((Object) executor);
    }

    public void execute(Runnable runnable) {
        synchronized (this.e) {
            this.b.add(runnable);
        }
        synchronized (this.e) {
            if (this.b.peek() == null) {
            } else if (this.d > 0) {
            } else if (this.c) {
            } else {
                this.c = true;
                try {
                    this.f.execute(new lhh(this));
                } catch (Throwable th) {
                    synchronized (this.e) {
                        this.c = false;
                    }
                }
            }
        }
    }
}
