package defpackage;

import java.util.concurrent.CountDownLatch;

final class ijy implements ijl<lyu>, Runnable {
    private final ijd a;
    private final String b;
    private final ijh c;
    private CountDownLatch d;

    public /* synthetic */ void a(nzf nzf) {
        b();
    }

    public /* synthetic */ void b(nzf nzf) {
        a();
    }

    ijy(ijd ijd, String str, ijh ijh) {
        this.a = ijd;
        this.b = str;
        this.c = ijh;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r3 = 1;
        r6 = 3;
        r0 = "vclib";
        r1 = "LeaveHandler starting";
        defpackage.itx.a(r6, r0, r1);
        r0 = new java.util.concurrent.CountDownLatch;
        r0.<init>(r3);
        r7.d = r0;
        r0 = new lyt;
        r0.<init>();
        r1 = r7.b;
        r0.a = r1;
        r1 = "vclib";
        r2 = "Sending leave RPC: %s";
        r3 = new java.lang.Object[r3];
        r4 = 0;
        r5 = r7.b;
        r3[r4] = r5;
        r2 = java.lang.String.format(r2, r3);
        defpackage.itx.a(r6, r1, r2);
        r1 = r7.a;
        r1.c(r0, r7);
        r0 = r7.d;	 Catch:{ InterruptedException -> 0x0051 }
        r2 = 1;
        r1 = java.util.concurrent.TimeUnit.MINUTES;	 Catch:{ InterruptedException -> 0x0051 }
        r0 = r0.await(r2, r1);	 Catch:{ InterruptedException -> 0x0051 }
        if (r0 != 0) goto L_0x0044;
    L_0x003c:
        r0 = "vclib";
        r1 = "LeaveRPC not complete yet! Not waiting any further";
        r2 = 5;
        defpackage.itx.a(r2, r0, r1);	 Catch:{ InterruptedException -> 0x0051 }
    L_0x0044:
        r0 = r7.c;
        r0.a();
    L_0x0049:
        r0 = "vclib";
        r1 = "LeaveHandler terminating";
        defpackage.itx.a(r6, r0, r1);
        return;
    L_0x0051:
        r0 = move-exception;
        r0 = "vclib";
        r1 = "LeaveHandler was interrupted!";
        r2 = 6;
        defpackage.itx.a(r2, r0, r1);	 Catch:{ all -> 0x0060 }
        r0 = r7.c;
        r0.a();
        goto L_0x0049;
    L_0x0060:
        r0 = move-exception;
        r1 = r7.c;
        r1.a();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ijy.run():void");
    }

    private void a() {
        itx.a(5, "vclib", "Leave RPC failed!");
        this.d.countDown();
    }

    private void b() {
        itx.a(3, "vclib", "Leave RPC succeeded!");
        this.d.countDown();
    }
}
