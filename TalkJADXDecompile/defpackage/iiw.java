package defpackage;

import android.content.Context;

/* renamed from: iiw */
final class iiw implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ iiu c;

    iiw(iiu iiu, Context context, String str) {
        this.c = iiu;
        this.a = context;
        this.b = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r4 = this;
        r0 = r4.a;	 Catch:{ gsr -> 0x0008, IOException -> 0x0012 }
        r1 = r4.b;	 Catch:{ gsr -> 0x0008, IOException -> 0x0012 }
        defpackage.gss.b(r0, r1);	 Catch:{ gsr -> 0x0008, IOException -> 0x0012 }
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
    L_0x0009:
        r1 = "vclib";
        r2 = "Failed to invalidate access token";
        r3 = 5;
        defpackage.itx.a(r3, r1, r2, r0);
        goto L_0x0007;
    L_0x0012:
        r0 = move-exception;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: iiw.run():void");
    }
}
