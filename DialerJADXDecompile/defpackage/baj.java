package defpackage;

import android.content.Context;

/* compiled from: PG */
/* renamed from: baj */
final class baj {
    private final bal a;
    private final Context b;
    private int c;
    private boolean d;

    baj(Context context, int i, bal bal) {
        this.c = i;
        this.a = bal;
        this.d = false;
        this.b = context;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void a(int r7, java.lang.Object r8, defpackage.bad r9, long r10) {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        monitor-enter(r6);
        r2 = r6.c;	 Catch:{ all -> 0x006d }
        r2 = r2 + -1;
        r6.c = r2;	 Catch:{ all -> 0x006d }
        r2 = r6.d;	 Catch:{ all -> 0x006d }
        if (r2 != 0) goto L_0x0019;
    L_0x000d:
        r2 = r9.j;	 Catch:{ all -> 0x006d }
        if (r2 != 0) goto L_0x0015;
    L_0x0011:
        r2 = r6.c;	 Catch:{ all -> 0x006d }
        if (r2 != 0) goto L_0x0019;
    L_0x0015:
        r0 = 1;
        r6.d = r0;	 Catch:{ all -> 0x006d }
        r0 = r1;
    L_0x0019:
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        if (r0 == 0) goto L_0x006c;
    L_0x001c:
        r0 = r6.a;
        if (r0 == 0) goto L_0x006c;
    L_0x0020:
        r0 = r6.b;
        r0 = defpackage.buf.I(r0);
        r0 = r0.a();
        r1 = r9.j;
        if (r1 == 0) goto L_0x0067;
    L_0x002e:
        if (r0 == 0) goto L_0x0067;
    L_0x0030:
        r1 = defpackage.ban.a(r0, r9);
        r2 = r6.b;
        r3 = defpackage.aq.cq;
        r2 = r2.getString(r3);
        r1.a(r2, r10);
        r2 = r6.b;
        r0.a(r2, r1);
        r1 = r9.q;
        if (r1 == 0) goto L_0x0067;
    L_0x0048:
        r1 = r9.d;
        if (r1 == 0) goto L_0x0067;
    L_0x004c:
        r1 = r6.b;	 Catch:{ IOException -> 0x007e }
        r1 = r1.getContentResolver();	 Catch:{ IOException -> 0x007e }
        r2 = r9.q;	 Catch:{ IOException -> 0x007e }
        r2 = r1.openInputStream(r2);	 Catch:{ IOException -> 0x007e }
        r1 = 0;
        if (r2 == 0) goto L_0x0062;
    L_0x005b:
        r3 = r6.b;	 Catch:{ Throwable -> 0x0070, all -> 0x0090 }
        r4 = r9.d;	 Catch:{ Throwable -> 0x0070, all -> 0x0090 }
        r0.a(r3, r4, r2);	 Catch:{ Throwable -> 0x0070, all -> 0x0090 }
    L_0x0062:
        if (r2 == 0) goto L_0x0067;
    L_0x0064:
        r2.close();	 Catch:{ IOException -> 0x007e }
    L_0x0067:
        r0 = r6.a;
        r0.a(r7, r8, r9);
    L_0x006c:
        return;
    L_0x006d:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x006d }
        throw r0;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0072 }
    L_0x0072:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0076:
        if (r2 == 0) goto L_0x007d;
    L_0x0078:
        if (r1 == 0) goto L_0x008c;
    L_0x007a:
        r2.close();	 Catch:{ Throwable -> 0x0087 }
    L_0x007d:
        throw r0;	 Catch:{ IOException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        r1 = "CallerInfoAsyncQuery";
        r2 = "failed to fetch directory contact photo";
        defpackage.bdf.a(r1, r2, r0);
        goto L_0x0067;
    L_0x0087:
        r2 = move-exception;
        r1.addSuppressed(r2);	 Catch:{ IOException -> 0x007e }
        goto L_0x007d;
    L_0x008c:
        r2.close();	 Catch:{ IOException -> 0x007e }
        goto L_0x007d;
    L_0x0090:
        r0 = move-exception;
        goto L_0x0076;
        */
        throw new UnsupportedOperationException("Method not decompiled: baj.a(int, java.lang.Object, bad, long):void");
    }
}
