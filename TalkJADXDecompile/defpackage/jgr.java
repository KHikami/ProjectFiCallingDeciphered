package defpackage;

/* renamed from: jgr */
final class jgr implements Runnable {
    final /* synthetic */ jgc a;
    final /* synthetic */ jgo b;

    jgr(jgo jgo, jgc jgc) {
        this.b = jgo;
        this.a = jgc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
        r0 = 0;
        r1 = r7.a;
        r2 = r7.b;
        r2 = r2.a;
        r3 = new jgz;
        r3.<init>(r0);
        if (r2 != 0) goto L_0x0014;
    L_0x000e:
        r4 = r1.e();	 Catch:{ Throwable -> 0x0053 }
        if (r4 == 0) goto L_0x0015;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r4 = "You must provide a Context with your background task, or if you're using deprecated methods, you must provide your BackgroundTask with a Context.";
        defpackage.ba.a(r0, r4);	 Catch:{ Throwable -> 0x0053 }
        r0 = r1.c();	 Catch:{ Throwable -> 0x0053 }
        if (r0 != 0) goto L_0x0026;
    L_0x0020:
        if (r2 == 0) goto L_0x0026;
    L_0x0022:
        r0 = r1.a(r2);	 Catch:{ Throwable -> 0x0053 }
    L_0x0026:
        if (r0 != 0) goto L_0x006a;
    L_0x0028:
        r0 = new java.lang.AssertionError;	 Catch:{ Throwable -> 0x0053 }
        r4 = r1.getClass();	 Catch:{ Throwable -> 0x0053 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ Throwable -> 0x0053 }
        r5 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0053 }
        r6 = java.lang.String.valueOf(r4);	 Catch:{ Throwable -> 0x0053 }
        r6 = r6.length();	 Catch:{ Throwable -> 0x0053 }
        r6 = r6 + 31;
        r5.<init>(r6);	 Catch:{ Throwable -> 0x0053 }
        r6 = "Null result in BackgroundTask: ";
        r5 = r5.append(r6);	 Catch:{ Throwable -> 0x0053 }
        r4 = r5.append(r4);	 Catch:{ Throwable -> 0x0053 }
        r4 = r4.toString();	 Catch:{ Throwable -> 0x0053 }
        r0.<init>(r4);	 Catch:{ Throwable -> 0x0053 }
        throw r0;	 Catch:{ Throwable -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler();	 Catch:{ all -> 0x0089 }
        if (r4 == 0) goto L_0x0083;
    L_0x005a:
        r5 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0089 }
        r4.uncaughtException(r5, r0);	 Catch:{ all -> 0x0089 }
        r0 = r1.e;	 Catch:{ all -> 0x0093 }
        r0.a(r1, r3);	 Catch:{ all -> 0x0093 }
        r1.d(r2);
    L_0x0069:
        return;
    L_0x006a:
        r4 = r1.f;	 Catch:{ Throwable -> 0x0053 }
        r0.a(r4);	 Catch:{ Throwable -> 0x0053 }
        r4 = defpackage.lka.a();	 Catch:{ Throwable -> 0x0053 }
        r0.b = r4;	 Catch:{ Throwable -> 0x0053 }
        r3 = r1.e;	 Catch:{ all -> 0x007e }
        r3.a(r1, r0);	 Catch:{ all -> 0x007e }
        r1.d(r2);
        goto L_0x0069;
    L_0x007e:
        r0 = move-exception;
        r1.d(r2);
        throw r0;
    L_0x0083:
        r4 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0089 }
        r4.<init>(r0);	 Catch:{ all -> 0x0089 }
        throw r4;	 Catch:{ all -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        r4 = r1.e;	 Catch:{ all -> 0x0098 }
        r4.a(r1, r3);	 Catch:{ all -> 0x0098 }
        r1.d(r2);
        throw r0;
    L_0x0093:
        r0 = move-exception;
        r1.d(r2);
        throw r0;
    L_0x0098:
        r0 = move-exception;
        r1.d(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jgr.run():void");
    }
}
