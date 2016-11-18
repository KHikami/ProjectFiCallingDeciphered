package defpackage;

final class gkk extends Thread {
    final /* synthetic */ gki a;

    gkk(gki gki) {
        this.a = gki;
        String str = "NotificationPlayer-";
        String valueOf = String.valueOf(gki.d);
        super(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8 = this;
        r7 = 0;
    L_0x0001:
        r0 = r8.a;
        r1 = r0.b;
        monitor-enter(r1);
        r0 = r8.a;	 Catch:{ all -> 0x0037 }
        r0 = r0.b;	 Catch:{ all -> 0x0037 }
        r0 = r0.removeFirst();	 Catch:{ all -> 0x0037 }
        r0 = (defpackage.gkl) r0;	 Catch:{ all -> 0x0037 }
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        r1 = r0.a;
        switch(r1) {
            case 1: goto L_0x003a;
            case 2: goto L_0x0040;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = r8.a;
        r1 = r0.b;
        monitor-enter(r1);
        r0 = r8.a;	 Catch:{ all -> 0x00ba }
        r0 = r0.b;	 Catch:{ all -> 0x00ba }
        r0 = r0.size();	 Catch:{ all -> 0x00ba }
        if (r0 != 0) goto L_0x00b7;
    L_0x0025:
        r0 = r8.a;	 Catch:{ all -> 0x00ba }
        r2 = 0;
        r0.e = r2;	 Catch:{ all -> 0x00ba }
        r0 = r8.a;	 Catch:{ all -> 0x00ba }
        r2 = r0.g;	 Catch:{ all -> 0x00ba }
        if (r2 == 0) goto L_0x0035;
    L_0x0030:
        r0 = r0.g;	 Catch:{ all -> 0x00ba }
        r0.release();	 Catch:{ all -> 0x00ba }
    L_0x0035:
        monitor-exit(r1);	 Catch:{ all -> 0x00ba }
        return;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        throw r0;
    L_0x003a:
        r1 = r8.a;
        r1.a(r0);
        goto L_0x0016;
    L_0x0040:
        r1 = r8.a;
        r2 = r1.f;
        if (r2 == 0) goto L_0x0016;
    L_0x0046:
        r2 = defpackage.glj.b();
        r4 = r0.f;
        r2 = r2 - r4;
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0076;
    L_0x0053:
        r4 = r1.d;
        r5 = new java.lang.StringBuilder;
        r6 = 54;
        r5.<init>(r6);
        r6 = "Notification stop delayed by ";
        r5 = r5.append(r6);
        r2 = r5.append(r2);
        r3 = "msecs";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r3 = new java.lang.Object[r3];
        defpackage.glk.d(r4, r2, r3);
    L_0x0076:
        r2 = r1.f;
        r2.stop();
        r2 = r1.f;
        r2.release();
        r1.f = r7;
        r2 = r1.h;
        if (r2 == 0) goto L_0x0096;
    L_0x0086:
        r0 = r0.g;
        if (r0 == 0) goto L_0x00af;
    L_0x008a:
        r0 = r1.a;
        r2 = new gkj;
        r2.<init>(r1);
        r4 = 3000; // 0xbb8 float:4.204E-42 double:1.482E-320;
        r0.postDelayed(r2, r4);
    L_0x0096:
        r0 = r1.c;
        if (r0 == 0) goto L_0x0016;
    L_0x009a:
        r0 = r1.c;
        r0 = r0.getThread();
        r0 = r0.getState();
        r2 = java.lang.Thread.State.TERMINATED;
        if (r0 == r2) goto L_0x0016;
    L_0x00a8:
        r0 = r1.c;
        r0.quit();
        goto L_0x0016;
    L_0x00af:
        r0 = r1.h;
        r0.abandonAudioFocus(r7);
        r1.h = r7;
        goto L_0x0096;
    L_0x00b7:
        monitor-exit(r1);	 Catch:{ all -> 0x00ba }
        goto L_0x0001;
    L_0x00ba:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x00ba }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gkk.run():void");
    }
}
