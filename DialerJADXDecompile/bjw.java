/* compiled from: PG */
final class bjw implements Runnable {
    private String a;
    private String b;
    private bej c;
    private String d;
    private /* synthetic */ bju e;

    bjw(bju bju, String str, String str2, String str3, bej bej) {
        this.e = bju;
        this.a = str2;
        this.b = str3;
        this.c = bej;
        this.d = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r7 = this;
        r0 = 0;
        r5 = 2;
        r1 = r7.b;	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r2 = bju.a(r1);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r1 = android.net.Uri.parse(r2);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r3 = r1.getScheme();	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r4 = "https";
        r4 = r4.equals(r3);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        if (r4 == 0) goto L_0x0045;
    L_0x0018:
        r1 = r7.a(r2);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
    L_0x001c:
        if (r1 == 0) goto L_0x0033;
    L_0x001e:
        r2 = r7.e;	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r2 = r2.c;	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r2 = r2.getContentResolver();	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r3 = r2.openInputStream(r1);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r0 = android.graphics.BitmapFactory.decodeStream(r3);	 Catch:{ Throwable -> 0x0066, all -> 0x00b9 }
        if (r3 == 0) goto L_0x0033;
    L_0x0030:
        r3.close();	 Catch:{ Exception -> 0x00b4, all -> 0x00ad }
    L_0x0033:
        r1 = r7.c;
        r0 = android.util.Pair.create(r1, r0);
        r1 = r7.e;
        r1 = r1.g;
        r0 = r1.obtainMessage(r5, r0);
        r0.sendToTarget();
    L_0x0044:
        return;
    L_0x0045:
        r2 = "content";
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        if (r2 != 0) goto L_0x001c;
    L_0x004d:
        r2 = "android.resource";
        r2 = r2.equals(r3);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        if (r2 != 0) goto L_0x001c;
    L_0x0055:
        r1 = bju.a;	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r2 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r3 = " scheme not supported for image lookups.";
        r2 = r2.concat(r3);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        bdf.b(r1, r2);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        r1 = r0;
        goto L_0x001c;
    L_0x0066:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0068 }
    L_0x0068:
        r1 = move-exception;
    L_0x0069:
        if (r3 == 0) goto L_0x0070;
    L_0x006b:
        if (r2 == 0) goto L_0x00a9;
    L_0x006d:
        r3.close();	 Catch:{ Throwable -> 0x008e }
    L_0x0070:
        throw r1;	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
    L_0x0071:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
    L_0x0075:
        r2 = bju.a;	 Catch:{ all -> 0x00b2 }
        r3 = "Error fetching image.";
        bdf.a(r2, r3, r0);	 Catch:{ all -> 0x00b2 }
        r0 = r7.c;
        r0 = android.util.Pair.create(r0, r1);
        r1 = r7.e;
        r1 = r1.g;
        r0 = r1.obtainMessage(r5, r0);
        r0.sendToTarget();
        goto L_0x0044;
    L_0x008e:
        r3 = move-exception;
        r2.addSuppressed(r3);	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        goto L_0x0070;
    L_0x0093:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
    L_0x0097:
        r2 = r7.c;
        r1 = android.util.Pair.create(r2, r1);
        r2 = r7.e;
        r2 = r2.g;
        r1 = r2.obtainMessage(r5, r1);
        r1.sendToTarget();
        throw r0;
    L_0x00a9:
        r3.close();	 Catch:{ Exception -> 0x0071, all -> 0x0093 }
        goto L_0x0070;
    L_0x00ad:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0097;
    L_0x00b2:
        r0 = move-exception;
        goto L_0x0097;
    L_0x00b4:
        r1 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0075;
    L_0x00b9:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjw.run():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.net.Uri a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = 0;
        r1 = r6.a;
        if (r1 != 0) goto L_0x0006;
    L_0x0005:
        return r0;
    L_0x0006:
        r1 = r6.e;
        r1 = r1.e;
        r1 = r6.e;
        r1 = r1.c;
        r2 = r6.d;
        r2 = bjr.a(r1, r2, r7);
        if (r2 != 0) goto L_0x001c;
    L_0x0016:
        if (r2 == 0) goto L_0x0005;
    L_0x0018:
        r2.close();
        goto L_0x0005;
    L_0x001c:
        r1 = bju.b;	 Catch:{ Throwable -> 0x002e, all -> 0x0045 }
        r3 = r6.e;	 Catch:{ Throwable -> 0x002e, all -> 0x0045 }
        r3 = r3.c;	 Catch:{ Throwable -> 0x002e, all -> 0x0045 }
        r4 = r6.a;	 Catch:{ Throwable -> 0x002e, all -> 0x0045 }
        r0 = r1.a(r3, r4, r2);	 Catch:{ Throwable -> 0x002e, all -> 0x0045 }
        if (r2 == 0) goto L_0x0005;
    L_0x002a:
        r2.close();
        goto L_0x0005;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0030 }
    L_0x0030:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x0034:
        if (r2 == 0) goto L_0x003b;
    L_0x0036:
        if (r1 == 0) goto L_0x0041;
    L_0x0038:
        r2.close();	 Catch:{ Throwable -> 0x003c }
    L_0x003b:
        throw r0;
    L_0x003c:
        r2 = move-exception;
        r1.addSuppressed(r2);
        goto L_0x003b;
    L_0x0041:
        r2.close();
        goto L_0x003b;
    L_0x0045:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjw.a(java.lang.String):android.net.Uri");
    }
}
