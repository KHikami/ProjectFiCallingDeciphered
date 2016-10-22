final class lhh implements Runnable {
    final /* synthetic */ lhg a;

    lhh(lhg lhg) {
        this.a = lhg;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r7 = this;
    L_0x0000:
        r1 = java.lang.Thread.interrupted();	 Catch:{ Error -> 0x003a }
        r0 = 0;
        r2 = r7.a;	 Catch:{ all -> 0x004a }
        r2 = r2.e;	 Catch:{ all -> 0x004a }
        monitor-enter(r2);	 Catch:{ all -> 0x004a }
        r3 = r7.a;	 Catch:{ all -> 0x0047 }
        r3 = r3.d;	 Catch:{ all -> 0x0047 }
        if (r3 != 0) goto L_0x001a;
    L_0x0010:
        r0 = r7.a;	 Catch:{ all -> 0x0047 }
        r0 = r0.b;	 Catch:{ all -> 0x0047 }
        r0 = r0.poll();	 Catch:{ all -> 0x0047 }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0047 }
    L_0x001a:
        if (r0 != 0) goto L_0x002c;
    L_0x001c:
        r0 = r7.a;	 Catch:{ all -> 0x0047 }
        r3 = 0;
        r0.c = r3;	 Catch:{ all -> 0x0047 }
        monitor-exit(r2);	 Catch:{ all -> 0x0047 }
        if (r1 == 0) goto L_0x002b;
    L_0x0024:
        r0 = java.lang.Thread.currentThread();	 Catch:{ Error -> 0x003a }
        r0.interrupt();	 Catch:{ Error -> 0x003a }
    L_0x002b:
        return;
    L_0x002c:
        monitor-exit(r2);	 Catch:{ all -> 0x0047 }
        r0.run();	 Catch:{ RuntimeException -> 0x0055 }
    L_0x0030:
        if (r1 == 0) goto L_0x0000;
    L_0x0032:
        r0 = java.lang.Thread.currentThread();	 Catch:{ Error -> 0x003a }
        r0.interrupt();	 Catch:{ Error -> 0x003a }
        goto L_0x0000;
    L_0x003a:
        r0 = move-exception;
        r1 = r7.a;
        r1 = r1.e;
        monitor-enter(r1);
        r2 = r7.a;	 Catch:{ all -> 0x007f }
        r3 = 0;
        r2.c = r3;	 Catch:{ all -> 0x007f }
        monitor-exit(r1);	 Catch:{ all -> 0x007f }
        throw r0;
    L_0x0047:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0047 }
        throw r0;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0054;
    L_0x004d:
        r1 = java.lang.Thread.currentThread();	 Catch:{ Error -> 0x003a }
        r1.interrupt();	 Catch:{ Error -> 0x003a }
    L_0x0054:
        throw r0;	 Catch:{ Error -> 0x003a }
    L_0x0055:
        r2 = move-exception;
        r3 = lhg.a;	 Catch:{ all -> 0x004a }
        r4 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x004a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x004a }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004a }
        r6 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x004a }
        r6 = r6.length();	 Catch:{ all -> 0x004a }
        r6 = r6 + 35;
        r5.<init>(r6);	 Catch:{ all -> 0x004a }
        r6 = "Exception while executing runnable ";
        r5 = r5.append(r6);	 Catch:{ all -> 0x004a }
        r0 = r5.append(r0);	 Catch:{ all -> 0x004a }
        r0 = r0.toString();	 Catch:{ all -> 0x004a }
        r3.log(r4, r0, r2);	 Catch:{ all -> 0x004a }
        goto L_0x0030;
    L_0x007f:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x007f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: lhh.run():void");
    }
}
