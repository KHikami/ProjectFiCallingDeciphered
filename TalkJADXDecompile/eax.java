import android.content.Context;

final class eax {
    eax() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(android.content.Context r14, int r15) {
        /*
        r0 = com.google.android.apps.hangouts.content.EsProvider.l;
        r1 = com.google.android.apps.hangouts.content.EsProvider.a(r0, r15);
        r0 = r14.getContentResolver();
        r2 = ebv.a;
        r3 = eat.a;
        r4 = 0;
        r5 = "timestamp ASC";
        r6 = r0.query(r1, r2, r3, r4, r5);
        if (r6 == 0) goto L_0x0094;
    L_0x0017:
        r10 = new gjj;	 Catch:{ all -> 0x00a6 }
        r10.<init>();	 Catch:{ all -> 0x00a6 }
        r11 = 0;
        r2 = -1;
        r4 = 0;
        r0 = -1;
        r6.moveToPosition(r0);	 Catch:{ all -> 0x00a6 }
    L_0x0024:
        r0 = r6.moveToNext();	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x0062;
    L_0x002a:
        r0 = fwx.values();	 Catch:{ all -> 0x00a6 }
        r1 = 12;
        r1 = r6.getInt(r1);	 Catch:{ all -> 0x00a6 }
        r3 = r0[r1];	 Catch:{ all -> 0x00a6 }
        r0 = 7;
        r7 = r6.getString(r0);	 Catch:{ all -> 0x00a6 }
        r0 = 11;
        r0 = r6.getLong(r0);	 Catch:{ all -> 0x00a6 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 / r8;
        r8 = eau.a;	 Catch:{ all -> 0x00a6 }
        r3 = r3.ordinal();	 Catch:{ all -> 0x00a6 }
        r3 = r8[r3];	 Catch:{ all -> 0x00a6 }
        switch(r3) {
            case 1: goto L_0x0024;
            case 2: goto L_0x0024;
            case 3: goto L_0x0052;
            default: goto L_0x004f;
        };	 Catch:{ all -> 0x00a6 }
    L_0x004f:
        r0 = r2;
    L_0x0050:
        r2 = r0;
        goto L_0x0024;
    L_0x0052:
        r11 = r11 + 1;
        r10.add(r7);	 Catch:{ all -> 0x00a6 }
        r2 = r6.getPosition();	 Catch:{ all -> 0x00a6 }
        r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x004f;
    L_0x005f:
        r4 = r0;
        r0 = r2;
        goto L_0x0050;
    L_0x0062:
        r0 = ecm.p;	 Catch:{ all -> 0x00a6 }
        if (r0 == 0) goto L_0x0076;
    L_0x0066:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a6 }
        r1 = 43;
        r0.<init>(r1);	 Catch:{ all -> 0x00a6 }
        r1 = "query for failed message sends: ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00a6 }
        r0.append(r11);	 Catch:{ all -> 0x00a6 }
    L_0x0076:
        if (r11 <= 0) goto L_0x00a2;
    L_0x0078:
        r0 = 1;
        if (r11 != r0) goto L_0x0095;
    L_0x007b:
        r6.moveToPosition(r2);	 Catch:{ all -> 0x00a6 }
        r3 = new ebs;	 Catch:{ all -> 0x00a6 }
        r3.<init>(r6, r15);	 Catch:{ all -> 0x00a6 }
        r0 = new ebb;	 Catch:{ all -> 0x00a6 }
        r1 = r14;
        r2 = r15;
        r0.<init>(r1, r2, r3, r4);	 Catch:{ all -> 0x00a6 }
        ecm.a(r0);	 Catch:{ all -> 0x00a6 }
    L_0x008d:
        r1 = 1;
        r0.a(r1);	 Catch:{ all -> 0x00a6 }
    L_0x0091:
        r6.close();
    L_0x0094:
        return;
    L_0x0095:
        r7 = new eba;	 Catch:{ all -> 0x00a6 }
        r8 = r14;
        r9 = r15;
        r12 = r4;
        r7.<init>(r8, r9, r10, r11, r12);	 Catch:{ all -> 0x00a6 }
        ecm.a(r7);	 Catch:{ all -> 0x00a6 }
        r0 = r7;
        goto L_0x008d;
    L_0x00a2:
        eat.a(r14, r15);	 Catch:{ all -> 0x00a6 }
        goto L_0x0091;
    L_0x00a6:
        r0 = move-exception;
        r6.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: eax.a(android.content.Context, int):void");
    }

    void a(Context context, int i, String str) {
        gjj a = gjj.a(str);
        boolean a2 = ((fuz) jyn.a(context, fuz.class)).a(i);
        if (blf.c(new blo(context, i), a) > 0 && !a2) {
            a(context, i);
        }
    }
}
