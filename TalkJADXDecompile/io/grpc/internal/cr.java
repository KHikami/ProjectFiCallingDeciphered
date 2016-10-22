package io.grpc.internal;

import bm;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

class cr implements Executor {
    private static final Logger a;
    private boolean b;
    private ArrayDeque<Runnable> c;

    cr() {
    }

    static {
        a = Logger.getLogger(cr.class.getName());
    }

    public void execute(Runnable runnable) {
        bm.a((Object) runnable, (Object) "'task' must not be null.");
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

    private void a() {
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
