package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class msq {
    private static final Logger a = Logger.getLogger(msq.class.getName());
    private msr b;
    private boolean c;

    public void a(Runnable runnable, Executor executor) {
        bm.a((Object) runnable, (Object) "Runnable was null.");
        bm.a((Object) executor, (Object) "Executor was null.");
        synchronized (this) {
            if (this.c) {
                msq.b(runnable, executor);
                return;
            }
            this.b = new msr(runnable, executor, this.b);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
        r3 = this;
        r0 = 0;
        monitor-enter(r3);
        r1 = r3.c;	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0008;
    L_0x0006:
        monitor-exit(r3);	 Catch:{ all -> 0x001a }
    L_0x0007:
        return;
    L_0x0008:
        r1 = 1;
        r3.c = r1;	 Catch:{ all -> 0x001a }
        r1 = r3.b;	 Catch:{ all -> 0x001a }
        r2 = 0;
        r3.b = r2;	 Catch:{ all -> 0x001a }
        monitor-exit(r3);	 Catch:{ all -> 0x001a }
    L_0x0011:
        if (r1 == 0) goto L_0x001d;
    L_0x0013:
        r2 = r1.c;
        r1.c = r0;
        r0 = r1;
        r1 = r2;
        goto L_0x0011;
    L_0x001a:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x001a }
        throw r0;
    L_0x001d:
        if (r0 == 0) goto L_0x0007;
    L_0x001f:
        r1 = r0.a;
        r2 = r0.b;
        defpackage.msq.b(r1, r2);
        r0 = r0.c;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: msq.a():void");
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Throwable e) {
            Logger logger = a;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.log(level, new StringBuilder((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()).append("RuntimeException while executing runnable ").append(valueOf).append(" with executor ").append(valueOf2).toString(), e);
        }
    }
}
