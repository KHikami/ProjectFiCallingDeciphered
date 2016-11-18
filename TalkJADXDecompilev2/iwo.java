package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

final class iwo implements UncaughtExceptionHandler {
    final UncaughtExceptionHandler a;
    final /* synthetic */ iwm b;

    iwo(iwm iwm, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = iwm;
        this.a = uncaughtExceptionHandler;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
        /*
        r4 = this;
        r0 = r4.b;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0 = r0.a;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0 = r0.a();	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        if (r0 == 0) goto L_0x003b;
    L_0x000a:
        r0 = new onl;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0.<init>();	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r1 = 1;
        r1 = java.lang.Boolean.valueOf(r1);	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0.a = r1;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r1 = new ook;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r1.<init>();	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r1.g = r0;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0 = r1.g;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r2 = new oog;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r2.<init>();	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r0.b = r2;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r0 = r1.g;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r2 = r4.b;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r2 = defpackage.gwb.ad(r2);	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
        r0.a = r2;	 Catch:{ Exception -> 0x0062, all -> 0x0057 }
    L_0x0034:
        r0 = r4.b;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r2 = 0;
        r3 = 0;
        r0.a(r2, r1, r3);	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
    L_0x003b:
        r0 = r4.b;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0 = r0.b;	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        defpackage.gwb.ac(r0);	 Catch:{ Exception -> 0x004c, all -> 0x0057 }
        r0 = r4.a;
        if (r0 == 0) goto L_0x004b;
    L_0x0046:
        r0 = r4.a;
        r0.uncaughtException(r5, r6);
    L_0x004b:
        return;
    L_0x004c:
        r0 = move-exception;
        r0 = r4.a;
        if (r0 == 0) goto L_0x004b;
    L_0x0051:
        r0 = r4.a;
        r0.uncaughtException(r5, r6);
        goto L_0x004b;
    L_0x0057:
        r0 = move-exception;
        r1 = r4.a;
        if (r1 == 0) goto L_0x0061;
    L_0x005c:
        r1 = r4.a;
        r1.uncaughtException(r5, r6);
    L_0x0061:
        throw r0;
    L_0x0062:
        r0 = move-exception;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: iwo.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
