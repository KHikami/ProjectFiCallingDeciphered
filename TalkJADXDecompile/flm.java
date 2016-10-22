public class flm implements Runnable {
    private final Object a;
    final Thread b;
    private final Object c;
    private final Object d;
    private Object e;
    private boolean f;
    private boolean g;
    private boolean h;
    private final long i;
    private final long j;
    private volatile boolean k;

    public flm(String str, long j, long j2) {
        this.b = new Thread(this);
        this.a = new Object();
        this.c = new Object();
        this.d = new Object();
        this.i = j;
        this.j = j2;
        this.b.setName(str);
        this.b.start();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r13 = this;
        r1 = 0;
    L_0x0001:
        r0 = r13.k;
        if (r0 != 0) goto L_0x0016;
    L_0x0005:
        r2 = r13.a;
        monitor-enter(r2);
        r0 = r13.f;	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0018;
    L_0x000c:
        r0 = r13.a;	 Catch:{ InterruptedException -> 0x0017 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0017 }
        r0 = r13.k;	 Catch:{ InterruptedException -> 0x0017 }
        if (r0 == 0) goto L_0x0018;
    L_0x0015:
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
    L_0x0016:
        return;
    L_0x0017:
        r0 = move-exception;
    L_0x0018:
        r0 = 0;
        r13.f = r0;	 Catch:{ all -> 0x003c }
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        r2 = glj.a();
        r4 = r13.c;
        monitor-enter(r4);
        r0 = r1;
    L_0x0024:
        r5 = r13.g;	 Catch:{ all -> 0x0039 }
        if (r5 != 0) goto L_0x0106;
    L_0x0028:
        r5 = r13.k;	 Catch:{ all -> 0x0039 }
        if (r5 != 0) goto L_0x0106;
    L_0x002c:
        r5 = r13.c;	 Catch:{ InterruptedException -> 0x009b }
        r6 = r13.i;	 Catch:{ InterruptedException -> 0x009b }
        r5.wait(r6);	 Catch:{ InterruptedException -> 0x009b }
        r5 = r13.k;	 Catch:{ InterruptedException -> 0x009b }
        if (r5 == 0) goto L_0x003f;
    L_0x0037:
        monitor-exit(r4);	 Catch:{ all -> 0x0039 }
        goto L_0x0016;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0039 }
        throw r0;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003c }
        throw r0;
    L_0x003f:
        r6 = glj.a();	 Catch:{ InterruptedException -> 0x009b }
        r6 = r6 - r2;
        r8 = r13.j;	 Catch:{ InterruptedException -> 0x009b }
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 < 0) goto L_0x009d;
    L_0x004a:
        r5 = "Babel";
        r6 = r13.j;	 Catch:{ InterruptedException -> 0x009b }
        r8 = r13.e;	 Catch:{ InterruptedException -> 0x009b }
        r8 = r13.a(r8);	 Catch:{ InterruptedException -> 0x009b }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ InterruptedException -> 0x009b }
        r9 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x009b }
        r10 = java.lang.String.valueOf(r8);	 Catch:{ InterruptedException -> 0x009b }
        r10 = r10.length();	 Catch:{ InterruptedException -> 0x009b }
        r10 = r10 + 61;
        r9.<init>(r10);	 Catch:{ InterruptedException -> 0x009b }
        r10 = "error, intent took more than ";
        r9 = r9.append(r10);	 Catch:{ InterruptedException -> 0x009b }
        r6 = r9.append(r6);	 Catch:{ InterruptedException -> 0x009b }
        r7 = " ms; opcode ";
        r6 = r6.append(r7);	 Catch:{ InterruptedException -> 0x009b }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x009b }
        r6 = r6.toString();	 Catch:{ InterruptedException -> 0x009b }
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ InterruptedException -> 0x009b }
        glk.d(r5, r6, r7);	 Catch:{ InterruptedException -> 0x009b }
        r5 = android.os.Process.myPid();	 Catch:{ InterruptedException -> 0x009b }
        r6 = 3;
        android.os.Process.sendSignal(r5, r6);	 Catch:{ InterruptedException -> 0x009b }
        r5 = android.os.Debug.isDebuggerConnected();	 Catch:{ InterruptedException -> 0x009b }
        if (r5 != 0) goto L_0x0024;
    L_0x0093:
        r5 = new java.lang.IllegalStateException;	 Catch:{ InterruptedException -> 0x009b }
        r6 = "hung up in RTCS";
        r5.<init>(r6);	 Catch:{ InterruptedException -> 0x009b }
        throw r5;	 Catch:{ InterruptedException -> 0x009b }
    L_0x009b:
        r5 = move-exception;
        goto L_0x0024;
    L_0x009d:
        r8 = r13.i;	 Catch:{ InterruptedException -> 0x009b }
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x0024;
    L_0x00a3:
        r5 = "Babel";
        r8 = r13.i;	 Catch:{ InterruptedException -> 0x009b }
        r10 = r13.e;	 Catch:{ InterruptedException -> 0x009b }
        r10 = r13.a(r10);	 Catch:{ InterruptedException -> 0x009b }
        r10 = java.lang.String.valueOf(r10);	 Catch:{ InterruptedException -> 0x009b }
        r11 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x009b }
        r12 = java.lang.String.valueOf(r10);	 Catch:{ InterruptedException -> 0x009b }
        r12 = r12.length();	 Catch:{ InterruptedException -> 0x009b }
        r12 = r12 + 104;
        r11.<init>(r12);	 Catch:{ InterruptedException -> 0x009b }
        r12 = "warning ";
        r11 = r11.append(r12);	 Catch:{ InterruptedException -> 0x009b }
        r11 = r11.append(r0);	 Catch:{ InterruptedException -> 0x009b }
        r12 = "; intent took more than ";
        r11 = r11.append(r12);	 Catch:{ InterruptedException -> 0x009b }
        r8 = r11.append(r8);	 Catch:{ InterruptedException -> 0x009b }
        r9 = " ms; opcode ";
        r8 = r8.append(r9);	 Catch:{ InterruptedException -> 0x009b }
        r8 = r8.append(r10);	 Catch:{ InterruptedException -> 0x009b }
        r9 = "; ";
        r8 = r8.append(r9);	 Catch:{ InterruptedException -> 0x009b }
        r6 = r8.append(r6);	 Catch:{ InterruptedException -> 0x009b }
        r7 = " so far";
        r6 = r6.append(r7);	 Catch:{ InterruptedException -> 0x009b }
        r6 = r6.toString();	 Catch:{ InterruptedException -> 0x009b }
        r7 = 0;
        r7 = new java.lang.Object[r7];	 Catch:{ InterruptedException -> 0x009b }
        glk.d(r5, r6, r7);	 Catch:{ InterruptedException -> 0x009b }
        if (r0 != 0) goto L_0x0102;
    L_0x00fa:
        r5 = android.os.Process.myPid();	 Catch:{ InterruptedException -> 0x009b }
        r6 = 3;
        android.os.Process.sendSignal(r5, r6);	 Catch:{ InterruptedException -> 0x009b }
    L_0x0102:
        r0 = r0 + 1;
        goto L_0x0024;
    L_0x0106:
        r0 = 0;
        r13.g = r0;	 Catch:{ all -> 0x0039 }
        monitor-exit(r4);	 Catch:{ all -> 0x0039 }
        r2 = r13.d;
        monitor-enter(r2);
        r0 = 1;
        r13.h = r0;	 Catch:{ all -> 0x0118 }
        r0 = r13.d;	 Catch:{ all -> 0x0118 }
        r0.notify();	 Catch:{ all -> 0x0118 }
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        goto L_0x0001;
    L_0x0118:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0118 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: flm.run():void");
    }

    public void b(Object obj) {
        if (!this.k) {
            synchronized (this.a) {
                this.f = true;
                this.e = obj;
                this.a.notify();
            }
        }
    }

    public void a() {
        if (!this.k) {
            synchronized (this.c) {
                this.g = true;
                this.c.notify();
            }
            synchronized (this.d) {
                if (!this.h) {
                    try {
                        this.d.wait();
                    } catch (InterruptedException e) {
                    }
                }
                this.h = false;
            }
        }
    }

    public String a(Object obj) {
        if (obj == null) {
            return "NULL";
        }
        return obj.toString();
    }

    public void b() {
        this.k = true;
        synchronized (this.a) {
            this.a.notify();
        }
        synchronized (this.c) {
            this.c.notify();
        }
        synchronized (this.d) {
            this.h = true;
            this.d.notify();
        }
        try {
            this.b.join(1000);
            if (this.b.isAlive()) {
                glk.e("Babel", "failed to stop watchdog thread in 1000 ms", new Object[0]);
            }
        } catch (InterruptedException e) {
        }
    }
}
