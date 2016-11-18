package defpackage;

final class fzm implements Runnable {
    final boolean a;
    private final bko b;
    private boolean c = false;
    private fzb d = null;

    public fzm(bko bko, boolean z) {
        this.b = bko;
        this.a = z;
    }

    public void a() {
        synchronized (this) {
            this.c = true;
            if (this.d != null) {
                this.d.h = true;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8 = this;
        r2 = -1;
        r4 = new blo;	 Catch:{ all -> 0x00db }
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x00db }
        r1 = r8.b;	 Catch:{ all -> 0x00db }
        r1 = r1.g();	 Catch:{ all -> 0x00db }
        r4.<init>(r0, r1);	 Catch:{ all -> 0x00db }
        r0 = r8.a;	 Catch:{ all -> 0x00db }
        if (r0 == 0) goto L_0x0065;
    L_0x0015:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x00db }
        r1 = defpackage.jcf.class;
        r0 = defpackage.jyn.a(r0, r1);	 Catch:{ all -> 0x00db }
        r0 = (defpackage.jcf) r0;	 Catch:{ all -> 0x00db }
        r1 = r8.b;	 Catch:{ all -> 0x00db }
        r1 = r1.g();	 Catch:{ all -> 0x00db }
        r0 = r0.a(r1);	 Catch:{ all -> 0x00db }
        r1 = "sms_no_full_sync_till_millis";
        r6 = -1;
        r0 = r0.a(r1, r6);	 Catch:{ all -> 0x00db }
        r6 = defpackage.glj.a();	 Catch:{ all -> 0x00db }
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x017c;
    L_0x003b:
        r0 = defpackage.fzb.a;	 Catch:{ all -> 0x00db }
        if (r0 == 0) goto L_0x005b;
    L_0x003f:
        r0 = r8.b;	 Catch:{ all -> 0x00db }
        r0 = r0.g();	 Catch:{ all -> 0x00db }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r2 = 59;
        r1.<init>(r2);	 Catch:{ all -> 0x00db }
        r2 = "SmsSyncManager A#";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00db }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00db }
        r1 = ": task can not be scheduled yet";
        r0.append(r1);	 Catch:{ all -> 0x00db }
    L_0x005b:
        r0 = r8.b;
        r0 = r0.a();
        defpackage.fzb.a(r0, r8);
    L_0x0064:
        return;
    L_0x0065:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x00db }
        r1 = defpackage.jcf.class;
        r0 = defpackage.jyn.a(r0, r1);	 Catch:{ all -> 0x00db }
        r0 = (defpackage.jcf) r0;	 Catch:{ all -> 0x00db }
        r1 = r8.b;	 Catch:{ all -> 0x00db }
        r1 = r1.g();	 Catch:{ all -> 0x00db }
        r0 = r0.a(r1);	 Catch:{ all -> 0x00db }
        r1 = "sms_last_sync_time_millis";
        r2 = -1;
        r0 = r0.a(r1, r2);	 Catch:{ all -> 0x00db }
    L_0x0083:
        monitor-enter(r8);	 Catch:{ all -> 0x00db }
        r2 = r8.c;	 Catch:{ all -> 0x00d8 }
        if (r2 == 0) goto L_0x00bc;
    L_0x0088:
        r0 = "Babel_SMS";
        r1 = r8.b;	 Catch:{ all -> 0x00d8 }
        r1 = r1.g();	 Catch:{ all -> 0x00d8 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d8 }
        r3 = 42;
        r2.<init>(r3);	 Catch:{ all -> 0x00d8 }
        r3 = "SmsSyncManager A#";
        r2 = r2.append(r3);	 Catch:{ all -> 0x00d8 }
        r1 = r2.append(r1);	 Catch:{ all -> 0x00d8 }
        r2 = ": task aborted";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00d8 }
        r1 = r1.toString();	 Catch:{ all -> 0x00d8 }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00d8 }
        defpackage.glk.c(r0, r1, r2);	 Catch:{ all -> 0x00d8 }
        monitor-exit(r8);	 Catch:{ all -> 0x00d8 }
        r0 = r8.b;
        r0 = r0.a();
        defpackage.fzb.a(r0, r8);
        goto L_0x0064;
    L_0x00bc:
        r2 = new fzb;	 Catch:{ all -> 0x00d8 }
        r3 = r8.a;	 Catch:{ all -> 0x00d8 }
        r2.<init>(r4, r0, r3);	 Catch:{ all -> 0x00d8 }
        r8.d = r2;	 Catch:{ all -> 0x00d8 }
        monitor-exit(r8);	 Catch:{ all -> 0x00d8 }
        r0 = r8.d;	 Catch:{ all -> 0x00db }
        r1 = r0.b();	 Catch:{ all -> 0x00db }
        if (r1 >= 0) goto L_0x00e6;
    L_0x00ce:
        r0 = r8.b;
        r0 = r0.a();
        defpackage.fzb.a(r0, r8);
        goto L_0x0064;
    L_0x00d8:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x00d8 }
        throw r0;	 Catch:{ all -> 0x00db }
    L_0x00db:
        r0 = move-exception;
        r1 = r8.b;
        r1 = r1.a();
        defpackage.fzb.a(r1, r8);
        throw r0;
    L_0x00e6:
        r0 = r8.a;	 Catch:{ all -> 0x00db }
        if (r0 == 0) goto L_0x010d;
    L_0x00ea:
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x00db }
        r2 = defpackage.jcf.class;
        r0 = defpackage.jyn.a(r0, r2);	 Catch:{ all -> 0x00db }
        r0 = (defpackage.jcf) r0;	 Catch:{ all -> 0x00db }
        r2 = r8.b;	 Catch:{ all -> 0x00db }
        r2 = r2.g();	 Catch:{ all -> 0x00db }
        r0 = r0.b(r2);	 Catch:{ all -> 0x00db }
        r2 = "sms_last_full_sync_time_millis";
        r6 = defpackage.glj.a();	 Catch:{ all -> 0x00db }
        r0 = r0.b(r2, r6);	 Catch:{ all -> 0x00db }
        r0.d();	 Catch:{ all -> 0x00db }
    L_0x010d:
        r0 = defpackage.fzb.a(r4);	 Catch:{ all -> 0x00db }
        if (r0 != 0) goto L_0x0168;
    L_0x0113:
        r0 = r8.a;	 Catch:{ all -> 0x00db }
        if (r0 == 0) goto L_0x0173;
    L_0x0117:
        if (r1 != 0) goto L_0x0173;
    L_0x0119:
        r0 = "Babel_SMS";
        r1 = r8.b;	 Catch:{ all -> 0x00db }
        r1 = r1.g();	 Catch:{ all -> 0x00db }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00db }
        r3 = 75;
        r2.<init>(r3);	 Catch:{ all -> 0x00db }
        r3 = "SmsSyncManager A#";
        r2 = r2.append(r3);	 Catch:{ all -> 0x00db }
        r1 = r2.append(r1);	 Catch:{ all -> 0x00db }
        r2 = ": even after full sync we are still not in sync";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00db }
        r1 = r1.toString();	 Catch:{ all -> 0x00db }
        r2 = 0;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00db }
        defpackage.glk.e(r0, r1, r2);	 Catch:{ all -> 0x00db }
        r0 = defpackage.gwb.H();	 Catch:{ all -> 0x00db }
        r1 = defpackage.jcf.class;
        r0 = defpackage.jyn.a(r0, r1);	 Catch:{ all -> 0x00db }
        r0 = (defpackage.jcf) r0;	 Catch:{ all -> 0x00db }
        r1 = r8.b;	 Catch:{ all -> 0x00db }
        r1 = r1.g();	 Catch:{ all -> 0x00db }
        r0 = r0.b(r1);	 Catch:{ all -> 0x00db }
        r1 = "sms_no_full_sync_till_millis";
        r2 = defpackage.glj.a();	 Catch:{ all -> 0x00db }
        r4 = defpackage.fzb.e;	 Catch:{ all -> 0x00db }
        r2 = r2 + r4;
        r0 = r0.b(r1, r2);	 Catch:{ all -> 0x00db }
        r0.d();	 Catch:{ all -> 0x00db }
    L_0x0168:
        r0 = r8.b;
        r0 = r0.a();
        defpackage.fzb.a(r0, r8);
        goto L_0x0064;
    L_0x0173:
        r0 = r8.b;	 Catch:{ all -> 0x00db }
        r1 = 1;
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        defpackage.fzb.a(r0, r1, r2);	 Catch:{ all -> 0x00db }
        goto L_0x0168;
    L_0x017c:
        r0 = r2;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: fzm.run():void");
    }
}
