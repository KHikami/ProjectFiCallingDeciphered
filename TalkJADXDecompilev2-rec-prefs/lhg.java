package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public final class lhg implements Executor {
    static final Logger f25000a = Logger.getLogger(lhg.class.getName());
    final Deque<Runnable> f25001b = new ArrayDeque();
    boolean f25002c = false;
    int f25003d = 0;
    final Object f25004e = new Object();
    private final Executor f25005f;

    public lhg(Executor executor) {
        this.f25005f = (Executor) bm.m6122a((Object) executor);
    }

    public void execute(Runnable runnable) {
        synchronized (this.f25004e) {
            this.f25001b.add(runnable);
        }
        synchronized (this.f25004e) {
            if (this.f25001b.peek() == null) {
            } else if (this.f25003d > 0) {
            } else if (this.f25002c) {
            } else {
                this.f25002c = true;
                try {
                    this.f25005f.execute(new lhh(this));
                } catch (Throwable th) {
                    synchronized (this.f25004e) {
                        this.f25002c = false;
                    }
                }
            }
        }
    }
}
