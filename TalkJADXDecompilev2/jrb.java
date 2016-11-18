package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

final class jrb implements Executor {
    private final BlockingQueue<Runnable> a = new LinkedBlockingQueue();

    jrb() {
    }

    public void execute(Runnable runnable) {
        this.a.add(runnable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r5.a;	 Catch:{ InterruptedException -> 0x0028 }
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r4 = java.util.concurrent.TimeUnit.HOURS;	 Catch:{ InterruptedException -> 0x0028 }
        r0 = r0.poll(r2, r4);	 Catch:{ InterruptedException -> 0x0028 }
        r0 = (java.lang.Runnable) r0;	 Catch:{ InterruptedException -> 0x0028 }
    L_0x0011:
        r0.run();	 Catch:{ all -> 0x002c }
        r0 = r5.a;	 Catch:{ all -> 0x002c }
        r0 = r0.poll();	 Catch:{ all -> 0x002c }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x002c }
        if (r0 != 0) goto L_0x0011;
    L_0x001e:
        if (r1 == 0) goto L_0x0027;
    L_0x0020:
        r0 = java.lang.Thread.currentThread();
        r0.interrupt();
    L_0x0027:
        return;
    L_0x0028:
        r0 = move-exception;
        r0 = 1;
        r1 = r0;
        goto L_0x0002;
    L_0x002c:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0036;
    L_0x002f:
        r1 = java.lang.Thread.currentThread();
        r1.interrupt();
    L_0x0036:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jrb.a():void");
    }
}
