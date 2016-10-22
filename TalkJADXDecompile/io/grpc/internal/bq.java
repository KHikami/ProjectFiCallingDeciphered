package io.grpc.internal;

import bm;
import java.util.logging.Level;
import java.util.logging.Logger;
import mfw;

public final class bq implements Runnable {
    private static final Logger a;
    private final Runnable b;

    static {
        a = Logger.getLogger(bq.class.getName());
    }

    public bq(Runnable runnable) {
        this.b = (Runnable) bm.a((Object) runnable, (Object) "task");
    }

    public void run() {
        try {
            this.b.run();
        } catch (Throwable th) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(this.b);
            logger.log(level, new StringBuilder(String.valueOf(valueOf).length() + 35).append("Exception while executing runnable ").append(valueOf).toString(), th);
            mfw.b(th);
            AssertionError assertionError = new AssertionError(th);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("LogExceptionRunnable(").append(valueOf).append(")").toString();
    }
}
