package io.grpc.internal;

import cob;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
class bw implements Executor {
    private static final Logger a;
    private boolean b;
    private ArrayDeque c;

    bw() {
    }

    static {
        a = Logger.getLogger(bw.class.getName());
    }

    public void execute(Runnable runnable) {
        cob.b((Object) runnable, (Object) "'task' must not be null.");
        if (this.b) {
            if (this.c == null) {
                this.c = new ArrayDeque(4);
            }
            this.c.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            logger.log(level, new StringBuilder(String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
        } finally {
            if (this.c != null) {
                a();
            }
            this.b = false;
        }
    }

    private final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(runnable);
                    logger.log(level, new StringBuilder(String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
                }
            } else {
                return;
            }
        }
    }
}
